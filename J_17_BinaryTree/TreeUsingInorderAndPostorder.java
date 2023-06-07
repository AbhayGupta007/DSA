package J_17_BinaryTree;

public class TreeUsingInorderAndPostorder {
    public static BinaryTreeNode<Integer> buildtreehelper(int in[], int post[], int sipost, int eipost, int siin, int eiin)
    {
        if(sipost > eipost)
        {
            return null;
        }
        int rootdata = post[eipost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        int rootindex = -1;
        for(int i = siin; i <= eiin; i++)
        {
            if(rootdata == in[i])
            {
                rootindex = i;
            }
        }
        int siinleft = siin;
        int eiinleft = rootindex -1;
        
        int lefttreelength = eiinleft - siinleft + 1;
        
        int sipostleft = sipost;
        int eipostleft = sipostleft + lefttreelength - 1;
        int siinright = rootindex + 1;
        int eiinright = eiin;
        int sipostright = eipostleft + 1;
        
        int righttreelength = eiinright - siinright + 1;

        int eipostright = sipostright + righttreelength - 1;
        

        BinaryTreeNode<Integer> lefttree = buildtreehelper(in , post, sipostleft, eipostleft, siinleft, eiinleft);
        BinaryTreeNode<Integer> righttree = buildtreehelper(in , post, sipostright, eipostright, siinright, eiinright);

        root.left = lefttree;
        root.right = righttree;
        return root;
    }
    public static BinaryTreeNode<Integer> buildtree(int inorder[], int postorder[])
    {
        BinaryTreeNode<Integer> root = buildtreehelper(inorder, postorder, 0, postorder.length-1, 0,  inorder.length-1);
        return root;
    }
    public static void main(String[] args) {
        int postorder[] = {2, 9, 3, 6, 10, 5}; 
        int inorder[] = {2, 6, 3, 9, 5, 10}; 
        BinaryTreeNode<Integer> root = buildtree(inorder,postorder);
        BinaryTreeNode.printlevelwisedetailed(root);
    }
}