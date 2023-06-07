package J_20_Trees;

public class CountLeafNodes {
    static int count = 0;
    public static int countLeafNodes(GenericTree<Integer> root){
		if(root == null)
		{
			return 0;
		}
		if(root.children.size() == 0)
		{
			count++;
			return count;
		}
		for(GenericTree<Integer> child : root.children)
		{
			countLeafNodes(child);
		}	
		return count;
	}
}
