package J_17_BinaryTree;

import java.util.Scanner;

public class NodesGreaterThanX {
    public static int nodesgreaterthanX(BinaryTreeNode<Integer> root, int x)
    {
        if(root == null)
		{
			return 0;
		}
		int count = 0;
		int leftcount = nodesgreaterthanX(root.left, x);
		int rightcount = nodesgreaterthanX(root.right, x);
		if(root.data > x)
		{
			count++;
		}
		return count + leftcount + rightcount;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.print("Enter number to find count of its greatest from tree: ");
        int num = s.nextInt();
        System.out.println("Number of nodes greater than " + num +" are: "+ nodesgreaterthanX(tree, num));
        s.close();
    }
}
