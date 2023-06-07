package J_21_Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class javaCollections {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);
        if(map.containsKey("def"))
        {
            System.out.println("Map contains def.");
        }

        // Get value.
        int a = map.get("def");
        System.out.println(a);
        int b = 0;
        if(map.containsKey("jkl"))
        {
            b = map.get("jkl");
        }
        System.out.println(b);
        if(map.containsValue(3))
        {
            System.out.println("Map contains \"ghi\"");
        }

        map.put("ghi", 30);         //Key overwrite.
        System.out.println("My map size is: "+map.size());
        
        // Remove value.
        System.out.println("Value of removed key is: "+map.remove("ghi"));
        if(map.containsKey("ghi"))
        {
            System.out.println("Map has \"ghi\" ");
        }

        System.out.println("My map size is: "+map.size());

        Set<String> keys = map.keySet();
        for(String s : keys)
        {
            System.out.print(s +" ");
        }
    }
}