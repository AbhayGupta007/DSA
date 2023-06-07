package J_19_BST_2;
import java.util.ArrayList;

import J_17_BinaryTree.BinaryTreeNode;
public class NodeToRootPath {
    public static ArrayList<Integer> nodetorootpath(BinaryTreeNode<Integer>root, int x){
        if(root == null)
        {
            return null;
        }
        if(root.data == x)
        {
            ArrayList<Integer> path = new ArrayList<Integer>();
            path.add(x);
            return path;
        }
        if(x<root.data)
        {
            ArrayList<Integer> leftpath = nodetorootpath(root.left, x);
            if(leftpath != null)
            {
                leftpath.add(root.data);
                return leftpath;
            }
        }
        if(x>root.data)
        {
            ArrayList<Integer> rightpath = nodetorootpath(root.right, x);
            if(rightpath != null)
            {
                rightpath.add(root.data);
                return rightpath;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements in such a way that it follows BST property.");
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        ArrayList<Integer> path = nodetorootpath(root, 7);
        if(path != null)
        {
            for(int i : path)
            {
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("Element not found.");
        }
    }
}