import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BinaryFirstSearch {

    Node root;
  private  int aa;





    public static void main(String args[])
    {
        BinaryFirstSearch tree = new BinaryFirstSearch();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);


//        System.out.println("Level order traversal of binary tree is ");
//                tree.printLevelOrder();
        int a =0; int b=0;
        tree.aa=0;
        BinaryFirstSearch.temporary(a,b,tree.aa);
//        temporary(a,b,tree.aa);
        System.out.println(a+" v"+b+" v"+ tree.aa);
    }

    private static void temporary(int a, int b, int aa) {
        ++b;
        aa++;
            System.out.println(++a+" "+b+" "+aa);
    }


    private void printLevelOrder() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            if(temp.left!=null)
            {
                queue.add(temp.left);

            }
            if(temp.right!=null)
            {
                queue.add(temp.right);

            }
            System.out.print(temp.data);
        }
    }
}
