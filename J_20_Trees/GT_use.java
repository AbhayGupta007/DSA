package J_20_Trees;

public class GT_use {
    public static void main(String[] args) {
        GenericTree<Integer> root = new GenericTree<Integer>(4);
        GenericTree<Integer> node1 = new GenericTree<Integer>(1);
        GenericTree<Integer> node2 = new GenericTree<Integer>(2);
        GenericTree<Integer> node3 = new GenericTree<Integer>(3);
        GenericTree<Integer> node4 = new GenericTree<Integer>(5);
        GenericTree<Integer> node5 = new GenericTree<Integer>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        GenericTree.printTreedetailed(root);
        System.out.println("Total number of nodes is: "+NumberOfNodes.numofnodes(root));
        GenericTree<Integer> root1 = GenericTree.takeinput();
        GenericTree.printTreedetailed(root1);
    }
}