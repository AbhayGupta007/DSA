package J_21_Hashmaps;
import java.util.HashMap;
public class PairsWithDifferenceK {
    public static int getPairsWithDifferenceK(int arr[], int k) 
	{
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : arr)
		{
			if(map.containsKey(i-k))
			{
				count += map.get(i-k);
			}
			else if(map.containsKey(i+k))
			{
				count += map.get(i+k);
			}
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		return count;
	}
}