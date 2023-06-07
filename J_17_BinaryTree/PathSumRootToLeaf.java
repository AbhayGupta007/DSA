package J_17_BinaryTree;

import java.util.Scanner;

public class PathSumRootToLeaf {
    public static void help(BinaryTreeNode<Integer>root,int k, String str)
	{
		if(root == null || k < root.data)
		{
			return ;
		}
		if(k == root.data && root.left == null && root.right == null)
		{
			System.out.println(str + root.data);
			return;
		}
		str = str + root.data+" ";
		help(root.left, k-root.data, str);
		help(root.right, k-root.data, str);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		String str = "";
		help(root, k, str);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        BinaryTreeNode.printlevelwisedetailed(root);
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the number to find its path: ");
        int n = s.nextInt();
        rootToLeafPathsSumToK(root, n);
        s.close();
    }
}
