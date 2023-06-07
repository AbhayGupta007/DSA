package J_13_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeduplicates(int arr[])
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == result.get(result.size()-1))
            {
                continue;
            }
            else{
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void printarraylist(ArrayList<Integer> arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,10,20,20,20,30,40};
        ArrayList<Integer> a = removeduplicates(arr);
        printarraylist(a);
    }
}
