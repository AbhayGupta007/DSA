package J_20_Trees;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class GenericTree<T> {
    public T data;
    public ArrayList<GenericTree<T>> children;

    public GenericTree(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public static GenericTree<Integer> takeinput() {
        Scanner s = new Scanner(System.in);
        Queue<GenericTree<Integer>> pendingchildren = new LinkedList<GenericTree<Integer>>();
        System.out.print("Enter root data: ");
        int rootdata = s.nextInt();
        if (rootdata == -1) {
            s.close();
            return null;
        }
        GenericTree<Integer> root = new GenericTree<Integer>(rootdata);
        pendingchildren.add(root);
        while (!pendingchildren.isEmpty()) {
            GenericTree<Integer> front = pendingchildren.poll();
            System.out.print("Enter the number of childs for " + front.data + ": ");
            int numchilds = s.nextInt();
            for (int i = 0; i < numchilds; i++) {
                int childdata = s.nextInt();
                GenericTree<Integer> childnode = new GenericTree<Integer>(childdata);
                front.children.add(childnode);
                pendingchildren.add(childnode);
            }
        }
        s.close();
        return root;
    }
    public static void printTree(GenericTree<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            GenericTree<Integer> child = root.children.get(i);
            printTree(child);
        }
    }
    public static void printLevelWise(GenericTree<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<GenericTree<Integer>> parentqueue = new LinkedList<>();
        parentqueue.add(root);

        Queue<GenericTree<Integer>> childqueue = new LinkedList<>();
        while (parentqueue.size() > 0) {
            root = parentqueue.poll();
            System.out.print(root.data);
            if (parentqueue.size() != 0) {
                System.out.print(" ");
            }
            for (GenericTree<Integer> child : root.children) {
                childqueue.add(child);
            }
            if (parentqueue.size() == 0) {
                parentqueue = childqueue;
                childqueue = new LinkedList<>();
                System.out.println();
            }
        }
    }
    public static void printTreedetailed(GenericTree<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data + " ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            GenericTree<Integer> child = root.children.get(i);
            printTreedetailed(child);
        }
    }
}