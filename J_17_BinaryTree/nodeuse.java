package J_17_BinaryTree;

public class nodeuse {
    public static void print(BinaryTreeNode<Integer> root)
    {
        if(root == null )
        {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void printdetailed(BinaryTreeNode<Integer> root)
    {
        if(root == null )
        {
            return;
        }
        System.out.print(root.data+": ");
        if(root.left != null)
        {
            System.out.print("L"+root.left.data+" ");
        }
        if(root.right != null)
        {
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printdetailed(root.left);
        printdetailed(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootleft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer>(3);
        root.left = rootleft;
        root.right = rootright;
        BinaryTreeNode<Integer> tworight = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> threeleft = new BinaryTreeNode<Integer>(5);
        rootright.left = threeleft;
        rootleft.right  = tworight;
        print(root);System.out.println();
        printdetailed(root);
    }
}