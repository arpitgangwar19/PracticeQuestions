

public class DiameterOfTree {

    public static class Node {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static Node root;


    public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        DiameterOfTree tree = new DiameterOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function Call
        System.out.println(
                "The diameter of given binary tree is : "
                        + tree.diameter(root));
    }

    public static int diameter(Node root) {


        if(root==null)
            return 0;


        int lh = height(root.left);
        int rh = height(root.right);

        int ld =diameter(root.left);
        int rd = diameter(root.right);

            return Math.max(lh+rh, Math.max(ld,rd));
    }

    public static int height(Node node) {

        if(node==null)
            return 0;
        return (1+Math.max(height(node.left),height(node.right)));
    }

}
