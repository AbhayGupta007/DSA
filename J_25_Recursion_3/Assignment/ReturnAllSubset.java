package J_25_Recursion_3.Assignment;

public class ReturnAllSubset {
    public static int[][] subsets(int input[]) {
		return helper(input, 0);
	}
	public static int[][] helper(int input[], int beginindex)
	{
		if(beginindex == input.length)
		{
			return new int[1][0];
		}
		int temp[][] = helper(input, beginindex+1);
		int output[][] = new int[temp.length*2][];
		int index = 0;
		for(int i = 0; i < temp.length; i++)
		{
			output[index++] = temp[i];
		}
		for(int i = 0; i < temp.length; i++)
		{
			output[index] = new int[temp[i].length+1];
			output[index][0] = input[beginindex];
			for(int j = 0; j < temp[i].length; j++)
			{
				output[index][j+1] = temp[i][j];
			}
			index++;
		}
		return output;
	}
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int subs[][] = subsets(arr);
        for(int i[] : subs)
        {
            for(int j : i)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}