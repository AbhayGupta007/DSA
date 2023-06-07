package J_21_Hashmaps;
import java.util.HashMap;
public class LongestSubarrayZeroSum {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		int maxlength = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			int length = 0;
			if(sum == 0)
			{
				maxlength = i + 1;
			}
			if(map.containsKey(sum))
			{
				length = i - map.get(sum);
				if(maxlength < length)
				{
					maxlength = length;
				}
			}
			else
			{
				map.put(sum, i);
			}
		}
		return maxlength ;
	}
}