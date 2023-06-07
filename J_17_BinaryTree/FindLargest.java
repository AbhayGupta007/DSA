package J_17_BinaryTree;

public class FindLargest {
    public static int maxnumber(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        // Method-1
        int leftmax = maxnumber(root.left);
        int rightmax = maxnumber(root.right);
        return Math.max(root.data, Math.max(leftmax, rightmax));
        /*
         * Method-2
         * int max = root.data;
         * if(max <= maxnumber(root.left))
         * {
         * max = maxnumber(root.left);
         * }
         * if(max <= maxnumber(root.right)){
         * max = maxnumber(root.right);
         * }
         * return max;
         */
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println("Largest number is: " + maxnumber(tree));
    }
}