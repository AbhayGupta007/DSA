/*You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.
Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :
 m * x
where m is total number of subscribers whose budget is greater than or equal to x. */

package J_4_Arrays;

import java.util.Scanner;

public class Max_profit_on_app {
    public static void merge(int a[], int b[], int c[])
    {
        int i = 0, j = 0, k = 0;
        while( i < b.length && j < c.length)
        {
            if(b[i]>=c[j])
            {
                a[k] = c[j];
                k++;j++;
            }
            else{
                a[k] = b[i];
                k++;i++;
            }
        }
        if(i != b.length)
        {
            for(; i < b.length; i++)
            {
                a[k] = b[i];
                k++;
            }
        }
        if(j != c.length)
        {
            for(; j < c.length; j++)
            {
                a[k] = c[j];
                k++;
            }
        }
    }
    public static void mergesort(int a[])
    {
        if(a.length <= 1)
        {
            return;
        }
        int b[] = new int[a.length/2];
        int c[] = new int[a.length - b.length];
        for(int i = 0; i<a.length/2 ; i++)
        {
            b[i] = a[i];
        }
        for(int i = a.length/2; i<a.length; i++)
        {
            c[i - (a.length/2)] = a[i];
        }
        mergesort(b);
        mergesort(c);
        merge(a,b,c);
    }
    public static int budget(int arr[])
    {
        int profit = 0;
        mergesort(arr);
        for(int i = 0; i<arr.length; i++)
        {
            profit = Math.max(profit, arr[i] * (arr.length - i));
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println(budget(arr));
        s.close();
    }
}
