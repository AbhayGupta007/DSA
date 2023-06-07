package J_19_BST_2;

import J_17_BinaryTree.BinaryTreeNode;

class subtreereturn{
    int height;
    int max;
    int min;
    boolean isBST;
}
public class LargestBST {
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root){
		return helper(root).height;
	}
	public static subtreereturn helper(BinaryTreeNode<Integer> root) {
		subtreereturn ans = new subtreereturn();
		if(root == null)
		{
			ans.height = 0;
			ans.max = Integer.MIN_VALUE;
			ans.min = Integer.MAX_VALUE;
			ans.isBST = true;
			return ans;
		}
		subtreereturn left =  helper(root.left);
		subtreereturn right =  helper(root.right);

		if(!(right.min > root.data && right.isBST))
		{
			right.isBST = false;
		}
		if(!(left.max < root.data && left.isBST))
		{
			left.isBST = false;
		}
		if( !left.isBST || !right.isBST || right.min < root.data || left.max > root.data)
		{
			if(left.height > right.height)
			{
				left.isBST = false;
				return left;
			}
			else
			{
				right.isBST = false;
				return right;
			}
		}
		ans.isBST = true;
		ans.height = Math.max(left.height, right.height)+1;
		ans.max = Math.max(root.data, Math.max(left.max, right.max));
		ans.min = Math.min(root.data, Math.min(left.min, right.min));
		return ans;
	}
}
