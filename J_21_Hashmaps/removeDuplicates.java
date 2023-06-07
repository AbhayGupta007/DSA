package J_21_Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;


public class removeDuplicates {
    public static ArrayList<Integer> removedup(int arr[] )
    {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i : arr)
        {
            if(map.containsKey(i))
            {
                continue;
            }
            else{
                map.put(i, true);
                output.add(i);
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,3,1,6,2,5};
        ArrayList<Integer> output = removedup(arr);
        for(int i: output)
        {
            System.out.print(i+" ");
        }
    }
}
