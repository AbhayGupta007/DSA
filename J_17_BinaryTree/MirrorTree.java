package J_17_BinaryTree;

public class MirrorTree {
    public static void Mirrorthetree(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return ;
        }
        if(root.left == null && root.right == null)
        {
            return ;
        }
        Mirrorthetree(root.left);
        Mirrorthetree(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static void print(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data + " ");
        print(root.right);
        print(root.left);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(root);
        print(root);
        Mirrorthetree(root);
        System.out.println();
        BinaryTreeNode.print(root);
    }
}
