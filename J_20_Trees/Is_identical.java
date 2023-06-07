package J_20_Trees;

public class Is_identical {
    public static boolean checkIdentical(GenericTree<Integer> root1, GenericTree<Integer> root2){
		if(root1 == null && root2 == null)
		{
			return true;
		}
		if(root1 == null || root2 == null)
		{
			return false;
		}
		if(!root1.data.equals(root2.data))
		{
			return false;
		}
		if(root1.children.size() != root2.children.size())
		{
			return false;
		}
		for(int i = 0; i < root1.children.size(); i++)
		{
			if( !checkIdentical( root1.children.get(i), root2.children.get(i) ) )
			{
				return false;
			}
		}
		return true;
	}
}
