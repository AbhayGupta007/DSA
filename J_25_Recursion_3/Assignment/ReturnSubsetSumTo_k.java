package J_25_Recursion_3.Assignment;

public class ReturnSubsetSumTo_k {
    public static int[][] subsetsSumK(int input[], int k) {
		return subsetsumhelper(input, k, 0);
	}
	public static int[][] subsetsumhelper(int input[], int k, int beginindex){
		if(beginindex == input.length)
		{
			if(k == 0)
			{
				return new int[1][0];
			}
			else
			{
				return new int[0][0];
			}
		}
		int smalloutput1[][] = subsetsumhelper(input, k, beginindex+1);
		int smalloutput2[][] = subsetsumhelper(input, k-input[beginindex], beginindex +1);
		int output[][]= new int[smalloutput1.length + smalloutput2.length][];
		int index = 0;
		for(int i = 0; i<smalloutput1.length; i++)
		{
			output[index++] = smalloutput1[i];
		}
		for(int i = 0; i < smalloutput2.length; i++)
		{
			output[index] = new int[smalloutput2[i].length+1];
			output[index][0] = input[beginindex];
			for(int j  = 0; j< smalloutput2[i].length; j++)
			{
				output[index][j+1] = smalloutput2[i][j];
			}
			index++;
		} 
		return output;
	}
}
