package J_27_DP_1;

import java.util.Scanner;

public class MinStepsToOne {
    // Brute force recurssive method.
    public static int countMinStepsToOne(int n) {
		if(n == 1)
		{
			return 0;
		}
		int step1, step2 = Integer.MAX_VALUE, step3 = Integer.MAX_VALUE;
		step1 = countMinStepsToOne(n-1) + 1;
		if(n % 2 == 0)
		{
			step2 = countMinStepsToOne(n/2) + 1;
		}
		if(n % 3 == 0)
		{
			step3 = countMinStepsToOne(n/3) + 1;
		}
		return  Math.min(step1, Math.min(step2, step3));
	}
    // Recurrsive DP method (It will show stack overflow error in some test cases).
    public static int helper(int n , int dp[])
	{
		if( n==1)
		{
			return 0;
		}
		int ans1 , ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
		if(dp[n-1] == -1)
		{
			ans1 = helper(n-1, dp);
			dp[n-1] = ans1;
		}
		else{
			ans1 = dp[n-1];
		}
		if(n % 2 == 0)
		{
			if(dp[n/2] == -1)
			{
				ans2 = helper(n/2, dp);
				dp[n/2] = ans2;
			}
			else{
				ans2 = dp[n/2];
			}
		}
		if(n % 3 == 0)
		{
			if(dp[n/3] == -1)
			{
				ans3 = helper(n/3, dp);
				dp[n/3] = ans3;
			}
			else{
				ans3 = dp[n/3];
			}
		}
		return Math.min(ans1, Math.min(ans2, ans3))+1;
	}
    // Iterative DP method (It will not show stack overflow error in any test case).
    public static int countto1(int n) {
		if(n == 1)
        {
            return 0;
        }
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++)
        {
            int ans1,ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
            ans1 = dp[i-1];
            if(i % 2 == 0)
            {
                ans2 = dp[i/2];
            }
            if(i % 3 == 0)
            {
                ans3 = dp[i/3];
            }
            dp[i] = Math.min(Math.min(ans1, ans2), ans3)+1;
        }
        return dp[n];
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = countMinStepsToOne(n);
        System.out.println(ans);

        int ans2 = countto1(n);
        System.out.println(ans2);
        s.close();
    }
}
