package J_21_Hashmaps;
import java.util.HashMap;
public class PairSumTo_0 {
    public static int PairSum(int[] input, int size) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : input)
		{
			if(map.containsKey(-i))
			{
				int paircount = map.get(-i);
				count += paircount;
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
