package J_21_Hashmaps;
import java.util.HashMap;
import java.util.Scanner;
public class Maxfrequency {
    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : arr)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		int maxfrequency = Integer.MIN_VALUE;
		int maxvalue = 0;
		for(int i : arr)
		{
			if(map.get(i) > maxfrequency)
			{
				maxfrequency = map.get(i);
				maxvalue = i;
			}
		}
		return maxvalue;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = s.nextInt();
		int arr[] =  new int[n];
		System.out.print("Enter elements of array: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("The number with maximum frequency is: "+ maxFrequencyNumber(arr));
		s.close();
	}
}