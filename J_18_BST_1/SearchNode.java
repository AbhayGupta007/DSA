package J_18_BST_1;

import java.util.Scanner;

import J_17_BinaryTree.BinaryTreeNode;

public class SearchNode {
    public static boolean searchinBST(BinaryTreeNode<Integer> root, int k) {
        if (root == null) 
        {
            return false;
        }
        if (root.data == k) 
        {
            return true;
        }
        if (root.data < k) 
        {
            return searchinBST(root.right, k);
        } 
        else
        {
            return searchinBST(root.left, k);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter elements in BST format: ");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        System.out.print("Enter element to search: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Boolean a = searchinBST(root, n);
        System.out.print(a);
        s.close();
    }
}