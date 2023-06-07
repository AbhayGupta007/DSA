package J_18_BST_1;

import java.util.Scanner;

import J_17_BinaryTree.BinaryTreeNode;

public class BST_from_SortedArray {
    public static BinaryTreeNode<Integer> buildtreehelp(int[] arr, int si, int ei)
	{
		if(si > ei)
		{
			return null;
		}
		int mid = (si+ei)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = buildtreehelp(arr, si, mid -1);
		root.right = buildtreehelp(arr, mid + 1, ei);
		return root;
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return buildtreehelp(arr, 0, n - 1);
	}
    public static void preorderprint(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data + " ");
        preorderprint(root.left);
        preorderprint(root.right);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array:\n");
        for(int i = 0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);
        System.out.print("\nTree is: \n");
        preorderprint(root);
        s.close();
    }
}