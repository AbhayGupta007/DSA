package J_10_Recursion;

public class index_num {
    public static int firstIndex(int input[], int x) {
		
		if(input.length == 0)
		{
			return -1;
		}
		return check_first(input, x, 0);
	}
	
	public static int check_first (int input [], int x, int start)
	{
		if(input[start] == x)
		{
			return start+1;
		}
		else if(start == input.length -1)
		{
			return -1;
		}
		
		return check_first(input, x, start +1);
	}
    
	public static int lastindex(int arr[], int x)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		int last = arr.length-1;
		return check_last(arr, x, last);
	}
	public static int check_last(int arr[], int x, int last)
	{
		if(arr[last] == x)
		{
			return last;
		}
		if(last == 0)
		{
			return -1;
		}
		return check_last(arr, x, last - 1);
	}
	
	public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,4};
        int x = 4;
        System.out.println(firstIndex(arr, x));
		System.out.println(lastindex(arr, x));
    }
}
