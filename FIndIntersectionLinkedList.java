import java.util.HashSet;
import java.util.Set;

public class FIndIntersectionLinkedList {


    static class Node {
        int data;
        Node next;
    };

    // A utility function to return  intersection node
    static Node intersectPoint(Node headA, Node headB)
    {
        Node ptr1 = headA;
        Node ptr2 = headB;

        if(ptr1==null || ptr2==null)
            return null;
        while(ptr1!=ptr2)
        {

            ptr1= ptr1.next;
            ptr2=ptr2.next;
            if(ptr1==ptr2)
                return ptr1;

            if(ptr1==null)
            {
                ptr1=headB;
            }
            if(ptr2==null)
            {
                ptr2=headA;
            }
        }

        return ptr1;
    }

    // Function to print intersection nodes
// in  a given linked list

    // Driver code
    public static void main(String[] args)
    {
    /*
    Create two linked lists

    1st Linked list is 3.6.9.15.30
    2nd Linked list is 10.15.30

    15 30 are elements in the intersection list
    */

        Node newNode;
        Node head1 = new Node();
        head1.data = 10;
        Node head2 = new Node();
        head2.data = 3;
        newNode = new Node();
        newNode.data = 6;
        head2.next = newNode;
        newNode = new Node();
        newNode.data = 9;
        head2.next.next = newNode;
        newNode = new Node();
        newNode.data = 15;
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node();
        newNode.data = 30;
        head1.next.next = newNode;
        head1.next.next.next = null;
        Node intersect_node = null;
        Node intersect_node1 = null;
        // Find the intersection node of two linked lists
        intersect_node = intersectPoint(head1, head2);
        intersect_node1 = intersectPointUsingHashSet(head1, head2);

        System.out.print(intersect_node.data+" "+intersect_node1.data);

    }

    private static Node intersectPointUsingHashSet(Node headA, Node headB) {
        Set<Node> set = new HashSet<Node>();
        Node curr = headA;
        Node curr1 = headB;
        Node result =null;
        while(curr!=null)
        {
            set.add(curr);
            curr= curr.next;

        }
        while(curr1!=null)
        {
            if(set.contains(curr1))
            {
                System.out.print("abc");
                result = curr1;
                break;
            }
            curr1= curr1.next;

        }
        System.out.print(set);

        return result;

    }
}
