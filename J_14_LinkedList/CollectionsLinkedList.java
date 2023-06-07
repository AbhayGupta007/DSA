package J_14_LinkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>();      //This linked list which we are is using is doubly linked list.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 100);
        list.addFirst(5);
        list.set(3, 455);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}