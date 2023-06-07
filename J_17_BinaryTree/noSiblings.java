package J_17_BinaryTree;

public class noSiblings {
    public static void nodeswithoutsiblings(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        if(root.left != null && root.right == null)
        {
            System.out.print(root.left.data + " ");
        }
        if(root.left == null && root.right!= null)
        {
            System.out.print(root.right.data+" ");
        }
        nodeswithoutsiblings(root.left);
        nodeswithoutsiblings(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        nodeswithoutsiblings(tree);
        
    }
}