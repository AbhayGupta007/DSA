package J_25_Recursion_3.Assignment;

public class PrintSubsetsSumToK {
    public static void printSubsetsSumTok(int input[], int k) {
		int output[] = new int[0];
        helper(input,0,k,output);
	}
	public static void helper(int input[], int startindex, int k, int output[]){
		if(startindex == input.length )
		{
            if(k == 0)
            {
                for(int i : output)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            return;
		}
        int i = 0;
        int newoutput[] = new int[output.length+1];
        for(; i < output.length; i++)
        {
            newoutput[i] = output[i];
        }
        newoutput[i] = input[startindex];
        helper(input, startindex+1, k, output);
        helper(input, startindex+1, k - input[startindex], newoutput);
	}
    public static void main(String[] args) {
       int arr[] = {4,3,1};
       printSubsetsSumTok(arr, 5); 
    }
}