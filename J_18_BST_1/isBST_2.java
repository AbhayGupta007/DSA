package J_18_BST_1;
import J_17_BinaryTree.BinaryTreeNode;
public class isBST_2 {
    public static boolean checkisBST(BinaryTreeNode<Integer> root, int min, int max)
    {
        if(root == null)
        {
            return true;
        }
        if(root.data > min && root.data <= max)
        {
            boolean left = checkisBST(root, min, root.data -1);
            boolean right = checkisBST(root, root.data, max);
            return left && right;
        }
        else{
            return false;
        }
    }
    public static boolean checkisBST(BinaryTreeNode<Integer> root)
    {
        return checkisBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    public static void main(String[] args) {
        System.out.println("Enter elements in BST format: ");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        System.out.println(checkisBST(root));
    }
}
