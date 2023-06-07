//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

package J_6_String;

public class J10 {
    public static boolean isPermutation(String str1, String str2) 
    {
        if (str1.length() == str2.length()) 
        {
            int arr[] = new int[123];
            for (int i = 0; i < str1.length(); i++) 
            {
                arr[(int) str1.charAt(i)] += 1;
            }
            for (int i = 0; i < str2.length(); i++) 
            {
                arr[(int) str2.charAt(i)] -= 1;
            }
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] != 0) 
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "abbd";
        String str2 = "acdb";
        System.out.println(isPermutation(str1, str2));
    }
}