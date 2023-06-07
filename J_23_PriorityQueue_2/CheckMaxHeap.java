package J_23_PriorityQueue_2;

public class CheckMaxHeap {
    public static boolean checkMaxHeap(int arr[]) {
		int parentindex = 0;
		int leftchildindex = 1;
		int rightchildindex = 2;
		Boolean flag = true;
		while(leftchildindex < arr.length)
		{
			if(arr[leftchildindex] > arr[parentindex] )
			{
				flag = false; 
				break;
			}
			if(rightchildindex < arr.length && arr[rightchildindex] > arr[parentindex])
			{
				flag= false;
				break;
			}
			parentindex++;
			leftchildindex = (2*parentindex) +1;
			rightchildindex = leftchildindex + 1;
		}
		return flag;
	}
}
