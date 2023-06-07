package J_19_BST_2.BST_usingClasses;

import J_17_BinaryTree.BinaryTreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    public boolean isPresent(int x) {
        return isPresentHelper(root, x);
    }
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int k) {
        if (node == null) {
            return false;
        }
        if (node.data == k) {
            return true;
        }
        if (node.data < k) {
            return isPresentHelper(node.right, k);
        } else {
            return isPresentHelper(node.left, k);
        }
    }

    public void insert(int x) {
        root = inserthelper(root, x);
        size++;
    }
    private static BinaryTreeNode<Integer> inserthelper(BinaryTreeNode<Integer> node , int x){
        if(node == null)
        {
            BinaryTreeNode<Integer> newroot = new BinaryTreeNode<Integer>(x);
            return newroot;
        }
        if(node.data > x)
        {
            node.left = inserthelper(node.left, x);
        }
        if(node.data < x)
        {
            node.right = inserthelper(node.right, x);
        }
        return node;
    }

    public boolean delete(int x) {    //To call class deletehelper method. 
        BST_deleteReturn output = deletehelperByClass(root, x);
        root = output.root;
        if(output.deleted)
        {
            size--;
        }
        return output.deleted;
    }
    public void delete1(int x)        //To call iterative deletehelper method
    {
        root = deletehelperByNode(root, x);
    }
    private static BST_deleteReturn deletehelperByClass(BinaryTreeNode<Integer> root, int data){     //Method-1
        if(root == null)
        {
            return new BST_deleteReturn(null, false);
        }
        if(root.data < data)
        {
            BST_deleteReturn outputright = deletehelperByClass(root.right , data);
            root.right = outputright.root;
            outputright.root = root;
            return outputright;
        }
        if(root.data > data)
        {
            BST_deleteReturn outputleft = deletehelperByClass(root.left , data);
            root.left = outputleft.root;
            outputleft.root = root;
            return outputleft;
        }
        //0 children.
        if(root.left == null && root.right == null)
        {
            return new BST_deleteReturn(null, true);
        }
        //only left children.
        if(root.left != null && root.right == null)
        {
            return new BST_deleteReturn(root.left, true);
        }
        //only right children.
        if(root.left == null && root.right != null)
        {
            return new BST_deleteReturn(root.right, true);
        }
        // both children is present.
        int rightmin = minNumber(root.right);
        root.data = rightmin;
        BST_deleteReturn output = deletehelperByClass(root.right, rightmin);
        root.right = output.root;
        return new BST_deleteReturn(root, true);
    } 
    private static int minNumber(BinaryTreeNode<Integer> root){
		if(root == null)
		{
			return Integer.MAX_VALUE;
		}	
		int leftmin = minNumber(root.left); 
		int rightmin = minNumber(root.right); 
		int min = Math.min(root.data, Math.min(leftmin, rightmin));
		return min;
	}
    private static BinaryTreeNode<Integer> deletehelperByNode(BinaryTreeNode<Integer>root, int data)      //Method-2
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == data)
        {
            if(root.left == null && root.right == null)
            {
                return null;
            }
            else if(root.left == null && root.right != null)
            {
                return root.right;
            }
            else if(root.left != null && root.right == null)
            {
                return root.left;
            }
            else
            {
                BinaryTreeNode<Integer> rightmin = root.right;
                while(rightmin.left != null)
                {
                    rightmin = rightmin.left;
                }
                root.data = rightmin.data;
                root.right = deletehelperByNode(root.right, rightmin.data);
                return root;
            }
        }
        else if(root.data < data)
        {
            root.right = deletehelperByNode(root.right, data);
            return root;
        }
        else
        {
            root.left = deletehelperByNode(root.left, data);
            return root;
        }
    }

    public int size() {
        return size;
    }

    public void printTree() {
        printTreehelper(root);
    }
    private static void printTreehelper(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingchildren.add(node);
        pendingchildren.add(null);
        while (!pendingchildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingchildren.poll();
            if (front != null) {
                if (front.left != null) {
                    pendingchildren.add(front.left);
                }
                if (front.right != null) {
                    pendingchildren.add(front.right);
                }
                System.out.print(front.data + " ");
            } else {
                System.out.println();
                if(!pendingchildren.isEmpty())
                {
                    pendingchildren.add(null);
                }
            }
        }
    }
}