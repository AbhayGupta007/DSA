package J_17_BinaryTree;

public class CreateAndInsertDuplicateNode {
    public static void createinsertdup(BinaryTreeNode<Integer> root)
    {
        if(root == null)
        {
            return ;
        }
        BinaryTreeNode<Integer> dupnode = new BinaryTreeNode<Integer>(root.data);
        if(root.left != null)
        {
            BinaryTreeNode<Integer> tempnode = root.left;
            root.left = dupnode;
            dupnode.left = tempnode;
        }
        else{
            root.left = dupnode;
        }
        if(root.left.left != null)
        {
            createinsertdup(root.left.left);
        }
        if(root.right != null){
            createinsertdup(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeNode.takeinputLevelwise();
        BinaryTreeNode.print(root);
        createinsertdup(root);
        BinaryTreeNode.print(root);
        BinaryTreeNode.printlevelwise(root);
    }
}