package J_20_Trees;

public class MaximumNumber {
    public static int maxnum(GenericTree<Integer> root){
		if(root == null)
		{
			return 0;
		}
		int num = root.data;
		for(GenericTree<Integer> child : root.children)
		{
			int temp = maxnum(child);
			if(temp > num)
			{
				num = temp;
			}
		}
		return num;
	}
}
