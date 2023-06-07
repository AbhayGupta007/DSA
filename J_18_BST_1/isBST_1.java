package J_18_BST_1;

import J_17_BinaryTree.BinaryTreeNode;
class pair{
    public int maximumnum;
    public int minimumnum;
    public boolean istrue;
}

public class isBST_1 {
    public static int maximum(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        int leftmax = maximum(root.left);
        int rightmax = maximum(root.right);
        return Math.max(root.data, Math.max(leftmax, rightmax));
    }
    public static int minimum(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return Integer.MAX_VALUE;
        }
        int leftmin = minimum(root.left);
        int rightmin = minimum(root.right);
        return Math.min(root.data, Math.min(leftmin, rightmin));
    }
    public static boolean checkisBST_1(BinaryTreeNode<Integer>root)
    {
        if(root == null)
        {
            return true;
        }
        int leftmax = maximum(root.left);
        int rightmin = minimum(root.right);
        if(leftmax > root.data)
        {
            return false;
        }
        if(rightmin < root.data)
        {
            return false;
        }
        boolean isleftbal = checkisBST_1(root.left);
        boolean isrightbal = checkisBST_1(root.right);
        return isleftbal && isrightbal;
    }
    public static pair checkisBST_2help(BinaryTreeNode<Integer> root){
        if(root == null)
        {
            pair ans = new pair();
            ans.maximumnum = Integer.MIN_VALUE;
            ans.minimumnum = Integer.MAX_VALUE;
            ans.istrue = true;
            return ans;
        }
        pair leftval = checkisBST_2help(root.left);
        pair rightval = checkisBST_2help(root.right);
        
        int minimumoverall = Math.min(root.data, Math.min(leftval.minimumnum, rightval.minimumnum));
        int maximumoverall = Math.max(root.data, Math.max(leftval.maximumnum, rightval.maximumnum));
        Boolean val = true;
        
        if(root.data <= leftval.minimumnum || rightval.maximumnum < root.data || !leftval.istrue || !rightval.istrue)
        {
            val = false;
        }

        pair ans = new pair();
        ans.minimumnum = minimumoverall;
        ans.maximumnum = maximumoverall;
        ans.istrue = val;
        return ans;
    }
    public static boolean checkisBST_2(BinaryTreeNode<Integer> root)
    {
        pair ans = checkisBST_2help(root);
        return ans.istrue;
    }
    public static void main(String[] args) {
        System.out.println("Enter elements in BST format: ");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        System.out.println(checkisBST_2(root));
    }
}
