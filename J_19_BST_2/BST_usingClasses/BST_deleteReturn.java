package J_19_BST_2.BST_usingClasses;

import J_17_BinaryTree.BinaryTreeNode;

public class BST_deleteReturn {
    BinaryTreeNode<Integer> root ;
    boolean deleted;

    public BST_deleteReturn(BinaryTreeNode<Integer> root, boolean deleted){
        this.root = root;
        this.deleted = deleted;
    }
}
