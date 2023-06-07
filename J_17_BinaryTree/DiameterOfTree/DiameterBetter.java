package J_17_BinaryTree.DiameterOfTree;

import J_17_BinaryTree.BinaryTreeNode;

public class DiameterBetter {
    public static diameterReturn diameterhelper(BinaryTreeNode<Integer> root){
        if(root == null)
        {
            diameterReturn ans = new diameterReturn();
            ans.height = 0;
            ans.diameter = 0;
            return ans;
        }
        diameterReturn leftoutput = diameterhelper(root.left);
        diameterReturn rightoutput = diameterhelper(root.right);
        
        int maxdistance = (leftoutput.height + rightoutput.height) + 1;
        int height = Math.max(leftoutput.height, rightoutput.height) + 1;
        int currdiameter = Math.max(maxdistance, Math.max(leftoutput.diameter, rightoutput.diameter));
        
        diameterReturn ans = new diameterReturn();
        ans.height = height;
        ans.diameter = currdiameter;
        return ans;
    }
    public static int diameter(BinaryTreeNode<Integer>root)
    {
        diameterReturn ans = diameterhelper(root);
        return ans.diameter;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> tree = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(tree);
        System.out.println(diameter(tree));
    }
}
