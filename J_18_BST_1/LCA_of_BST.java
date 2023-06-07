package J_18_BST_1;
import java.util.Scanner;

import J_17_BinaryTree.BinaryTreeNode;
public class LCA_of_BST {
    // Method-1
    public static int getLCA1(BinaryTreeNode<Integer> root, int a , int b){
        if(root == null)
        {
            return -1;
        }
        if(b < root.data && a < root.data)
        {
            return getLCA1(root.left, a, b);
        }
        if(b > root.data && a > root.data)
        {
            return getLCA1(root.right, a, b);
        }
        if(b == root.data && a == root.data)
        {
            return root.data;
        }
        int inleft =  getLCA1(root.left, a, b);
        int inright =  getLCA1(root.right, a, b);
        if(inleft == -1 && inright == -1)
        {
            return -1;
        }
        else if(inleft == -1)
        {
            return inright;
        }
        else if(inright == -1)
        {
            return inleft;
        }
        else
        {
            return root.data;
        }
    }

    // Method-2
    public static int getLCA2(BinaryTreeNode<Integer> root, int a , int b)
    {
        if(root == null)
        {
            return -1;
        }
        if(b < root.data && a < root.data)
        {
            return getLCA2(root.left, a, b);
        }
        if(b > root.data && a > root.data)
        {
            return getLCA2(root.right, a, b);
        }
        boolean inleft = SearchNode.searchinBST(root, a);
        boolean inright = SearchNode.searchinBST(root, b);
        if(inleft && inright)
        {
            return root.data;
        }
        else if(inleft)
        {
            return a;
        }
        else if(inright){
            return b;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements in such a way that they follow BST property:- ");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        System.out.print("Enter node 1: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Enter node 2: ");
        int b = s.nextInt();
        System.out.print("LCA of given nodes from the BST is: " + getLCA1(root, a, b));
        s.close();
    }
}