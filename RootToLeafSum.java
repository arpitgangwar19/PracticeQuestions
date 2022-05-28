class RootNode {
    int data;
    RootNode left, right;

   RootNode(int item)
    {
        data = item;
        left = right = null;
    }
}
public class RootToLeafSum {

    RootNode root;





    public static void main(String args[])
    {
        int sum = 21;

        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
        RootToLeafSum tree = new RootToLeafSum();
        tree.root = new RootNode(10);
        tree.root.left = new RootNode(8);
        tree.root.right = new RootNode(2);
        tree.root.left.left = new RootNode(3);
        tree.root.left.right = new RootNode(5);
        tree.root.right.left = new RootNode(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println(
                    "There is a root to leaf path with sum "
                            + sum);
        else
            System.out.println(
                    "There is no root to leaf path with sum "
                            + sum);
    }

    private boolean hasPathSum(RootNode root, int sum) {
        boolean result = false;
        int leafSum = sum- root.data;
        if( leafSum == 0 && root.left==null && root.right==null)
            return result=true;
        if(root.left!=null)
           result= result || hasPathSum(root.left,sum-root.data);
        if(root.right!=null)
            result = result|| hasPathSum(root.right,sum-root.data);

return  result;
//        return hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data) ;
    }
}
