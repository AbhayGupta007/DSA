//ArrayLIst is a dynamic version of normal array as it can grow and shrink as per the requirement in the program.

package J_13_ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(1);     arr.add(10);    arr.add(5);
        for (int i = 0; i < arr.size(); i++) 
        {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println("\n" + arr.size());

        arr.add(1, 7);
        for (int i = 0; i < arr.size(); i++) 
        {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("Ant");    list.add("Bat");    list.add("Car");    list.add("Door");   list.add("Euro");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.set(2, "Bus");
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
        list.remove("Euro"); System.out.println();
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
        list.remove(3); System.out.println();
        for (int i = 0; i < list.size(); i++) 
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //Enhanced for-each loop
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}