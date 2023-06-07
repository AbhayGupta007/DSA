package J_17_BinaryTree;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data)
    {
        this.data = data;
    }

    public static BinaryTreeNode<Integer> takeinput(boolean isroot, int parentdata, boolean isleft)
    {
        // Method-1
        if(isroot)
        {
            System.out.print("Enter root data: ");
        }
        else{
            if(isleft)
            {
                System.out.print("Enter left child of "+ parentdata+ ": ");
            }
            else{
                System.out.print("Enter right child of "+ parentdata+ ": ");
            }
        }
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        
        if(data == -1)
        {
            // s.close();
            return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        root.left = takeinput(false, data, true);
        root.right = takeinput(false, data, false);

        // s.close();
        return root;
    }
    public static BinaryTreeNode<Integer> takeinput()
    {
        // Method-2
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        int data = s.nextInt();
        if(data == -1)
        {
            // s.close();
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        root.left = takeinput();
        root.right = takeinput();
        // s.close();
        return root;
    }
    public static BinaryTreeNode<Integer> takeinputLevelwise()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter root data: ");
        int data = s.nextInt();
        if(data == -1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        Queue<BinaryTreeNode<Integer>> pendingchild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingchild.add(root);
        while(!pendingchild.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingchild.poll();
            System.out.print("Enter left child of "+ front.data+": ");
            int leftdata = s.nextInt();
            if(leftdata != -1)
            {
                BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(leftdata);
                front.left = leftchild;
                pendingchild.add(leftchild);
            }
            System.out.print("Enter right child of "+ front.data+": ");
            int rightdata = s.nextInt();
            if(rightdata != -1)
            {
                BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(rightdata);
                front.right = leftchild;
                pendingchild.add(leftchild);
            }
        }
        return root;
    }
    public static void printlevelwise(BinaryTreeNode<Integer>root)
    {
        if(root == null)
        {
            return ;
        }
        Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingchildren.add(root);
        while(!pendingchildren.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingchildren.poll();
            if(front.left != null)
            {
                pendingchildren.add(front.left);
            }
            if(front.right != null)
            {
                pendingchildren.add(front.right);
            }
            System.out.print(front.data + " ");
        }
    }
    public static void printlevelwisedetailed(BinaryTreeNode<Integer> root)
    {
        if(root ==  null)
		{
			return ;
		}
		Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingchildren.add(root);
		while( !pendingchildren.isEmpty())
		{
			BinaryTreeNode<Integer>front = pendingchildren.poll();
			System.out.print(front.data+":");
			if(front.left != null)
			{
				System.out.print("L:"+front.left.data+",");
				pendingchildren.add(front.left);
			}
			else{
				System.out.print("L:-1,");
			}
			if(front.right != null)
			{
				System.out.println("R:"+front.right.data);
				pendingchildren.add(front.right);
			}
			else{
				System.out.println("R:-1");
			}
        }
    }
    public static void printlevelwisebetter(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        Queue<BinaryTreeNode<Integer>> pendingchildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingchildren.add(root);
        pendingchildren.add(null);
        while(!pendingchildren.isEmpty())
        {
            BinaryTreeNode<Integer> front = pendingchildren.poll();
            if(front != null)
            {
                if(front.left != null)
                {
                    pendingchildren.add(front.left);
                }
                if(front.right != null)
                {
                    pendingchildren.add(front.right);
                }
                System.out.print(front.data+" ");
            }
            else{
                System.out.println();
                if(!pendingchildren.isEmpty())
                {
                    pendingchildren.add(null);
                }
            }
        }
    }
    public static void print(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+":");
        if(root.left != null)
        {
            System.out.print(" L"+root.left.data);
        }
        if(root.right != null)
        {
            System.out.print(" R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }
}