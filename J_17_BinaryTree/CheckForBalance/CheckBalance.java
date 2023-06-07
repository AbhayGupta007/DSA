package J_17_BinaryTree.CheckForBalance;

import J_17_BinaryTree.BinaryTreeNode;

public class CheckBalance {
    public static BalancedTreeReturn isbalancebetter(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = 0;
            ans.isbalance = true;
            return ans;
        }
        BalancedTreeReturn leftoutput = isbalancebetter(root.left);
        BalancedTreeReturn rightoutput = isbalancebetter(root.right);
        boolean isbal = true;
        int height = 1 + Math.max(leftoutput.height, rightoutput.height);
        if(Math.abs(leftoutput.height - rightoutput.height) > 1)
        {
            isbal = false;
        }
        if(!leftoutput.isbalance || !rightoutput.isbalance)
        {
            isbal = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isbalance = isbal;
        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinput(true, 0, true);
        BinaryTreeNode.print(root);
    }
}
