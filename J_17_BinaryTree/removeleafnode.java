package J_17_BinaryTree;

public class removeleafnode {
    public static BinaryTreeNode<Integer> removeleaf(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        if(root.left == null && root.right == null)
        {
            return null;
        }
        root.left = removeleaf(root.left);
        root.right = removeleaf(root.right);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        tree = removeleaf(tree);
        System.out.println("After removing leafs final tree becomes: ");
        BinaryTreeNode.print(tree);
    }
}