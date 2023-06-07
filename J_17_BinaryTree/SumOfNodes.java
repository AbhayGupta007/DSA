package J_17_BinaryTree;

public class SumOfNodes {
    public static int sum(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return root.data + leftsum + rightsum;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0 , true);
        BinaryTreeNode.print(root);
        System.out.print("Total number of nodes is: "+sum(root));
    }
}
