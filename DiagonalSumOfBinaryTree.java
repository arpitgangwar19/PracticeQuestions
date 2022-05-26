import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
    int data; //node data
    int vd; //vertical distance diagonally
    TreeNode left, right; //left and right child's reference

    // Tree node constructor
    public TreeNode(int data)
    {
        this.data = data;
        vd = Integer.MAX_VALUE;
        left = right = null;
    }
}

// simulation  queue :    1,null,2,4,null
public class DiagonalSumOfBinaryTree {




    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(7);
        root.left.right.left = new TreeNode(11);
        root.left.left.right = new TreeNode(10);

//        tree.diagonalSum();
        diagonalSum(root);
    }

    private static void diagonalSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int sum = 0;
       TreeNode treeNode = null;
       queue.add(root);
       queue.add(null);  // for seperating from first digonal to other.
        while (!queue.isEmpty())
        {
            treeNode = queue.poll();
            if(treeNode==null)
            {
                System.out.println(sum);
                sum = 0 ;
                queue.offer(null);  // separating the previous digonal
                treeNode = queue.poll();  // getting next element
                if(treeNode==null)  // if queue of empty break out from while
                {
                    break;
                }
            }

            while (treeNode!=null)
            {
                sum = sum+treeNode.data;
                if(treeNode.left!=null)
                {
                    queue.add(treeNode.left);
                }
                treeNode= treeNode.right;
            }
        }


    }

}
