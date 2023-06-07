package J_17_BinaryTree;

public class DepthOfNode {
    public static void nodesatdepth(BinaryTreeNode<Integer> root, int k)
    {
        if(root == null)
        {
            return;
        }
        if(k == 0)
        {
            System.out.print(root.data + " ");
            return;
        }
        nodesatdepth(root.left, k-1);
        nodesatdepth(root.right, k-1);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        nodesatdepth(tree, 5);
    }
}