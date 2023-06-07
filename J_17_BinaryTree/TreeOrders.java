package J_17_BinaryTree;

public class TreeOrders {
    public static void postorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void preorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        inorder(tree);
    }
}
