package J_17_BinaryTree.DiameterOfTree;
import J_17_BinaryTree.BinaryTreeNode;
public class Diameter{
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return  1+Math.max(leftheight, rightheight); 
    }
    public static int diameter(BinaryTreeNode<Integer> root)
    {
        int op1 = height(root.left) + height(root.right);
        int op2 = diameter(root.left);
        int op3 = diameter(root.right);
        return Math.max(op1, Math.max(op2, op3));
    } 

    
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println(diameter(tree));
    }
}
