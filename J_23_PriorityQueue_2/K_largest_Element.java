package J_23_PriorityQueue_2;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_largest_Element {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for(int i = 0; i<k; i++)
		{
			p.add(input[i]);
		}
		for(int i = k; i < input.length; i++)
		{
			if(p.peek() >= input[i])
			{
				continue;
			}
			else{
				p.poll();
				p.add(input[i]);
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i : p)
		{
			ans.add(i);
		}
		return ans;
	}
    public static ArrayList<Integer> kSmallest(int n, int[] arr, int k) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for(int i =0; i < n; i++)
		{
			p.add(arr[i]);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while(k>0)
		{
			ans.add(p.poll());
			k--;
		}
		return ans;
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter how many elements you want: ");
        int k = s.nextInt();
        ArrayList<Integer> ans = kLargest(arr, k);
        System.out.print(k + " largest elements in given array are: ");
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        ans = kSmallest(arr.length, arr, k);
        System.out.print(k + " smallest elements in given array are: ");
        for(int i : ans)
        {
            System.out.print(i+" ");
        }
        s.close();
    }
}
