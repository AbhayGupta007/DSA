package J_19_BST_2;

import J_17_BinaryTree.BinaryTreeNode;
import java.util.ArrayList;

public class BST_to_SortedArray {
    //Method-1
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

    //Method-2
    public static ArrayList<Integer> binarytoarray2(BinaryTreeNode<Integer> root, ArrayList<Integer> arr)
    {
        if(root == null)
        {
            return null;
        }
        binarytoarray2(root.left, arr);
        arr.add(root.data);
        binarytoarray2(root.right, arr);
        return arr;
    }

    //Method-3
    public static ArrayList<Integer> binarytoarray3(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return null;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arrleft = binarytoarray3(root.left);
        ArrayList<Integer> arrright = binarytoarray3(root.right);
        if(arrleft != null)
        {
            for(int i : arrleft)
            {
                arr.add(i);
            }
        }
        arr.add(root.data);
        if(arrright != null)
        {
            for(int i : arrright)
            {
                arr.add(i);
            }
        }
        return arr;
    }
    
    public static int maximumnumber(BinaryTreeNode<Integer>root)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.right == null)
        {
            return root.data;
        }
        else
        {
            return maximumnumber(root.right);
        }
    }
    public static void main(String args[]) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        // ArrayList<Integer> array = new ArrayList<Integer>();
        // array = binarytoarray(root, array);
        ArrayList<Integer> array = binarytoarray3(root);
        // binarytoarray1(root);
        // System.out.println("Max is : " +maximumnumber(root));
        for(int i : array){
            System.out.print(i+ " ");
        }
    }
}