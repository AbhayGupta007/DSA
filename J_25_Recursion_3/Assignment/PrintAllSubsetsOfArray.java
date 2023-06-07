package J_25_Recursion_3.Assignment;

public class PrintAllSubsetsOfArray {
    public static void printSubsets(int input[]) {
		int output[] =  new int[0];
		helper(input,0, output);
	}
	public static void helper(int arr[], int startindex, int output[]){
		if(startindex == arr.length)
		{
			for(int i : output)
			{
				System.out.print(i+" ");
			}
            System.out.println();
            return;
		}
        int i = 0;
        int newoutput[] = new int[output.length + 1];
        for(; i < output.length; i++)
        {
            newoutput[i] = output[i];
        }
        newoutput[i] = arr[startindex];
        helper(arr, startindex+1, output);
        helper(arr, startindex+1, newoutput);
	}
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        printSubsets(arr);
    }
}
