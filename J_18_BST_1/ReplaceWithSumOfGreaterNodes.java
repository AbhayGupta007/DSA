package J_18_BST_1;

import J_17_BinaryTree.BinaryTreeNode;

public class ReplaceWithSumOfGreaterNodes {
    public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum )
	{
		if(root == null)
		{
			return 0;
		}
		int rsum = replaceWithLargerNodesSum(root.right, sum);
		int rootdata = root.data;
		root.data += rsum + sum;
		int lsum = replaceWithLargerNodesSum(root.left, root.data);

		return rootdata + rsum + lsum;
	}

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root == null)
		{
			return;
		}
		replaceWithLargerNodesSum(root, 0);
	}
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree= BinaryTreeNode.takeinputLevelwise();
        BinaryTreeNode.printlevelwisebetter(tree);
        replaceWithLargerNodesSum(tree);
        BinaryTreeNode.printlevelwisebetter(tree);
    }
}