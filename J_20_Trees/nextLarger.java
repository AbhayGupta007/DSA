package J_20_Trees;

public class nextLarger {
    public static GenericTree<Integer> findNextLargerNode(GenericTree<Integer> root, int n){
		if(root == null)
		{
			return null;
		}
		GenericTree<Integer> nextlarger = null;
		if(root.data > n)
		{
			nextlarger = root;
		}
		for(GenericTree<Integer> child : root.children)
		{
			GenericTree<Integer> temp = findNextLargerNode(child,n);
			if(temp != null)
			{
				if(nextlarger == null || temp.data > n && temp.data < nextlarger.data)
				{
					nextlarger = temp;
				}
			}
		}
		return nextlarger;
	}
}
