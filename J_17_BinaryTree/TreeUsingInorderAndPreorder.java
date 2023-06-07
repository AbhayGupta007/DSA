package J_17_BinaryTree;

public class TreeUsingInorderAndPreorder {
    public static BinaryTreeNode<Integer> buildtreehelp(int pre[], int in[], int sipre, int eipre, int siin, int eiin)
    {
        if(eipre<sipre)
        {
            return null;
        }
        int rootdata = pre[sipre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        int rootindex = -1;
        for(int i = siin; i<=eiin; i++)
        {
            if(rootdata == in[i])
            {
                rootindex = i;
                break;
            }
        }
        int sipreleft = sipre + 1;
        int eipreright = eipre;
        int siinleft = siin;
        int eiinleft = rootindex - 1;
        int siinright = rootindex + 1;
        int eiinright = eiin;
        
        int lefttreelength = eiinleft - siinleft + 1;

        int eipreleft = sipreleft + lefttreelength -1;
        int sipreright = eipreleft + 1;

        BinaryTreeNode<Integer> lefttree = buildtreehelp(pre, in, sipreleft, eipreleft, siinleft, eiinleft);
        BinaryTreeNode<Integer> righttree = buildtreehelp(pre, in, sipreright, eipreright, siinright, eiinright);
        root.left = lefttree;
        root.right = righttree;
        return root;
    }
    public static BinaryTreeNode<Integer> buildtree(int preorder[], int inorder[])
    {
        BinaryTreeNode<Integer> root = buildtreehelp(preorder, inorder, 0, preorder.length - 1, 0, inorder.length);
        return root;
    }
    public static void main(String[] args) {
        int preorder[] = {5,6,2,3,9,10};
        int inorder[] = {2,6,3,9,5,10};
        BinaryTreeNode<Integer> tree =  buildtree(preorder, inorder);
        BinaryTreeNode.printlevelwisedetailed(tree);
    }
}
