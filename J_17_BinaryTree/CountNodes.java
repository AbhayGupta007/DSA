package J_17_BinaryTree;

public class CountNodes {
    public static int countnodes(BinaryTreeNode<Integer>root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftcount = countnodes(root.left);
        int rightcount = countnodes(root.right);
        return 1 + leftcount + rightcount;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(root);
        int count = countnodes(root);
        System.out.println(count);
    }
}