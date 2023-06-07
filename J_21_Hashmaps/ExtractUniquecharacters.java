package J_21_Hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniquecharacters {
    public static String uniqueChar(String str){
		HashMap<Character, Integer> map = new HashMap<>();
        String s = "";
		for(int i = 0; i < str.length(); i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				continue;
			}
			else{
				map.put(str.charAt(i), 1);
                s = s + str.charAt(i);
			}
		}
		return s;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = uniqueChar(str);
        System.out.println(str1);
        s.close();
    }
}