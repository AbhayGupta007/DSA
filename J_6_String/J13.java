//Program to print the letter which is occuring maximum in the string.

package J_6_String;

public class J13 {
    public static char maxletter(String str)
    {
        int arr[] = new int[123];
        int temp = 0, index = 0;
        for(int i = 0; i<str.length(); i++)
        {
            arr[(int)str.charAt(i)] += 1;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(temp < arr[i])
            {
                temp = arr[i];
                index = i;
            }
        }
        return (char)index;
    }
    public static void main(String[] args) 
    {
        String str  = "ajnajkjndm";
        char ch  = maxletter(str);
        System.out.println(ch);
    }
}