package J_25_Recursion_3.Assignment;
import java.util.Scanner;
public class PermutationsOfString {
    public static String[] permutationOfString(String str){
		if(str.length() == 0)
		{
            String output[] = {""};
			return output;
		}
		String[] temp = permutationOfString(str.substring(1));
		String output[] = new String[temp.length * str.length()];
		int index = 0;
		for(int i  = 0; i < temp.length; i++)
		{
			for(int j = 0; j <= temp[i].length(); j++)
			{
                output[index] = temp[i].substring(0, j) + str.charAt(0) + temp[i].substring(j);
                index++;
			}
		}
        return output;
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
        s.close();
	}
}