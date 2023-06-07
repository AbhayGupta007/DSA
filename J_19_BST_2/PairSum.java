package J_19_BST_2;

import java.util.Stack;
import J_17_BinaryTree.BinaryTreeNode;
import java.util.ArrayList;

public class PairSum {
    // Method-1
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void binarytoarray1(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return ;
        }
        binarytoarray1(root.left);
        arr.add(root.data);
        binarytoarray1(root.right);
    }
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int num) {
		if(root == null)
        {
            return;
        }
        binarytoarray1(root);
        int s = 0;
        int e = arr.size() - 1;
        while(s<e)
        {
            if(arr.get(s) + arr.get(e) == num)
            {
                System.out.println(arr.get(s)+" "+arr.get(e));
                s++;
                e--;
            }
            else if(arr.get(s) + arr.get(e) < num)
            {
                s++;
            }
            else{
                e--;
            }
        }
	}
    
    // Method-2
    public static void PrintNodesSumToS(BinaryTreeNode<Integer> root, int num)
    {
        if(root == null)
        {
            return ;
        }
        Stack<BinaryTreeNode<Integer>> leftbranch = new Stack<>();
        pushleft(root,leftbranch);
        Stack<BinaryTreeNode<Integer>> rightbranch = new Stack<>();
        pushright(root,rightbranch);

        while(!(leftbranch.isEmpty() && rightbranch.isEmpty()))
        {
            if(leftbranch.peek().data + rightbranch.peek().data == num)
            {
                System.out.println(leftbranch.pop().data + " " + rightbranch.pop().data);
            }
            else if(leftbranch.peek().data + rightbranch.peek().data < num)
            {
                editleft(leftbranch);
            }
            else
            {
                editright(rightbranch);
            }
        }
    }
    public static void pushleft(BinaryTreeNode<Integer> root, Stack<BinaryTreeNode<Integer>> stack){
        if(root == null)
        {
            return ;
        }
        stack.push(root);
        if(root.left != null)
        {
            pushleft(root.left, stack);
        }
    }
    public static void pushright(BinaryTreeNode<Integer> root, Stack<BinaryTreeNode<Integer>> stack)
    {
        if(root == null)
        {
            return ;
        }
        stack.push(root);
        if(root.right != null)
        {
            pushleft(root.right, stack);
        }
    }
    public static void editleft(Stack<BinaryTreeNode<Integer>> stack)
    {
        BinaryTreeNode<Integer>root = stack.pop();
        if(root.right != null)
        {
            pushleft(root.right, stack);
        }
        else{
            pushleft(stack.peek().right, stack);
        }
    }
    public static void editright(Stack<BinaryTreeNode<Integer>>stack)
    {
        BinaryTreeNode<Integer> root = stack.pop();
        if(root.left != null)
        {
            pushright(root.left, stack);
        }
        else{
            pushright(stack.peek().right, stack);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        binarytoarray1(root);
    }
}