public class ReverseLinkedList {


    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    private void printList(Node head) {

        Node Curr = head;
        while (Curr!=null)
        {
            System.out.println(Curr.data);
            Curr=Curr.next;
        }
    }

    public Node reverse(Node head) {

        Node Curr = null;
        Node Next = head;
        Node Prev = null;

        while(Next!=null)
        {
            Curr=Next;
            Next = Next.next;
            Curr.next=Prev;
            Prev =Curr;

        }
        head = Curr;
        return head;
    }
}
