package J_21_Hashmaps;

import java.util.HashMap;
import java.util.ArrayList;

public class LongestPossibleSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        int start = 0, maxlength = 1;
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> lenmap = new HashMap<>();
        for (int i : arr) 
        {
            if (map.containsKey(i)) 
            {
                continue;
            } 
            else 
            {
                map.put(i, true);
            }
        }
        for (int i : arr) 
        {
            if (map.get(i)) 
            {
                int templength = 1, s = i, e = i;
                map.put(i, false);
                boolean flag = true;
                while (flag) 
                {
                    if (map.containsKey(e + 1)) 
                    {
                        e++;
                        templength++;
                        map.put(e, false);
                    } 
                    else 
                    {
                        flag = false;
                    }
                }
                flag = true;
                while (flag) 
                {
                    if (map.containsKey(s - 1)) 
                    {
                        s--;
                        templength++;
                        map.put(s, false);
                    } 
                    else 
                    {
                        flag = false;
                    }
                }
                if (templength >= maxlength) 
                {
                    maxlength = templength;
                    start = s;
                    lenmap.put(start, maxlength);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            if (lenmap.containsKey(arr[i]) && lenmap.get(arr[i]) >= maxlength) 
            {
                start = arr[i];
                maxlength = lenmap.get(arr[i]);
                break;
            }
        }
        ArrayList<Integer> arrr = new ArrayList<>();
        arrr.add(start);
        arrr.add(start + maxlength - 1);
        return arrr;
    }
}