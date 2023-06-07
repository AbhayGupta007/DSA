package J_17_BinaryTree;

public class HeightOfTree {
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1 + Math.max(leftheight, rightheight);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println("Height of tree is: " + height(tree));
    }
}
