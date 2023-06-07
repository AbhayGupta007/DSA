package J_18_BST_1;
import java.util.Scanner;

import J_17_BinaryTree.BinaryTreeNode;
public class ElementsINgivenRange {
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){		
		if(root == null)
		{
			return;
		}
		if(root.data > k2)
		{
			elementsInRangeK1K2(root.left, k1, k2);
		}
		if(root.data < k1)
		{
			elementsInRangeK1K2(root.right, k1, k2);
		}
		if(root.data <= k2 && root.data >= k1)
		{
			elementsInRangeK1K2(root.left, k1, k2);
			System.out.print(root.data + " ");
			elementsInRangeK1K2(root.right, k1, k2);
		}
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements in BST format: ");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        System.out.print("Enter starting range: ");
        int n1 = s.nextInt();
        System.out.print("Enter ending range: ");
        int n2 = s.nextInt();
        elementsInRangeK1K2(root, n1, n2);
        s.close(); 
    }
}