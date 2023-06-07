package J_19_BST_2.BST_usingClasses;

public class BST_use {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.printTree();
        tree.delete1(4);
        tree.printTree();
    }
}