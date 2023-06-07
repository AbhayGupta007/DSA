package J_20_Trees;

public class GetHeight {
    public static int getHeight(GenericTree<Integer> root){
		int ht = 0;
    	for(GenericTree<Integer> child : root.children)
    	{
        	ht = Math.max(ht, getHeight(child));
    	}
    	return ht+1;
	}
}