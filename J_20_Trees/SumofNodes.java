package J_20_Trees;

public class SumofNodes {
    public static int sumOfAllNode(GenericTree<Integer> root){
		if(root == null)
		{
			return 0;
		}
		else
		{
			int sum = root.data;
			for(int i = 0; i < root.children.size(); i++)
			{
				int childsum = sumOfAllNode(root.children.get(i));
				sum += childsum;
			}
			return sum;
		}
	}
}
