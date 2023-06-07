package J_17_BinaryTree;

public class NumberOfLeafs {
    public static int countleaf(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftleafcount = countleaf(root.left);
        int rightleafcount = countleaf(root.right);
        return leftleafcount + rightleafcount;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println("Number of leaf in tree is: " + countleaf(tree));
    }
}