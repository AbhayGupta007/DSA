package J_17_BinaryTree;

public class isNodePresent {
    public static boolean ispresent(BinaryTreeNode<Integer> root, int a) {
        if (root == null) 
        {
            return false;
        }
        if (root.data == a) 
        {
            return true;
        }
        return ((ispresent(root.left, a)) || (ispresent(root.right, a)));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println(ispresent(tree, 4));
    }
}