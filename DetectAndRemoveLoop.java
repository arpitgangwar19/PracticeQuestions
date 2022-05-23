import java.util.LinkedList;

public class DetectAndRemoveLoop {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data =data;
            next =null;
        }
    }
    static Node newNode(int key)
    {
        Node temp = new Node(key);

        return temp;
    }

    /* Driver program to test above function*/
    public static void main (String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        /* Create a loop for testing */
        head.next.next.next.next.next = head.next;

        System.out.println( "Total number of nodes in loop"+countNodesinLoop(head));
    }

    private static int  countNodesinLoop(Node head) {

        Node slow = head;
        Node fast = head;
            int result = 0;
        while (slow !=null && fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow.next=null; // this line can end loop from list if there is only single loop n list
                printList(head);

                return counteNode(slow);
            }

        }

        return result;
    }

    private static void printList(Node head) {

        Node curr= head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    private static int counteNode(Node slow) {

        int result = 1;
        Node temp = slow;
        while(temp.next!=slow)
        {
            result ++;
            temp = temp.next;
        }

            return result;
    }


}
