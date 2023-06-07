package J_17_BinaryTree;

public class ReplaceDataByDepth {
    public static BinaryTreeNode<Integer> replace(BinaryTreeNode<Integer> root, int k)
	{
		if(root == null)
		{
			return null;
		}
		else{
			root.data = k;
		}
		replace(root.left, k+1);
		replace(root.right, k+1);
		return root;
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) 
	{
	    //Your code goes here
		if(root == null)
		{
			return;
		}
		else{
			replace(root, 0);
		}
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        changeToDepthTree(tree);
        BinaryTreeNode.print(tree);
    }
}
