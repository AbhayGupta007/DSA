package J_17_BinaryTree.CheckForBalance;

import J_17_BinaryTree.BinaryTreeNode;

public class Check_Is_Balance {
    public static int height(BinaryTreeNode<Integer>root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return 1 + Math.max(leftheight, rightheight);
    }
    public static boolean isbalance(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return true;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if(Math.abs(rightheight - leftheight) > 1)
        {
            return false;
        }
        boolean isleftbalance = isbalance(root.left);
        boolean isrightbalance = isbalance(root.right);

        return isleftbalance && isrightbalance;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(root);
        System.out.println(isbalance(root));
    }
}