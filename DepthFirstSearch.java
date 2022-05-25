import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//class Node {
//    int data;
//    Node left, right;
//    public Node(int item)
//    {
//        data = item;
//        left = right = null;
//    }
//}

public class DepthFirstSearch {

    Node root;






    public static void main(String args[])
    {
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);


        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }


    private void printLevelOrder() {


        Stack<Node> stack = new Stack<>();
      Node current = null;
    stack.push(root);
    while(!stack.isEmpty()) {
        current = stack.pop();
        System.out.println(current.data);

        if(current.right != null) {
            stack.push(current.right);
        }
        if(current.left != null) {
            stack.push(current.left);
        }
    }
    }
}
