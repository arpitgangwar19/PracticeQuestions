import java.util.Stack;

class LinkedListPalindrome {
    public static void main(String args[])
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);
    }
    static boolean isPalindrome(Node head)
    {
        Stack<Node> stack = new Stack<>();
       Node curr = head;
      while (curr !=null)
      {
          stack.push(curr);
          curr= curr.ptr;
      }
      curr = head;
      while (curr!=null)
      {
          if(curr.data!=stack.pop().data)
              return  false;
//          stack.pop();
          curr = curr.ptr;
      }
        return stack.isEmpty();
    }
   static class Node {
        int data;
        Node ptr;
        Node(int d)
        {
            ptr = null;
            data = d;
        }
    }
}

