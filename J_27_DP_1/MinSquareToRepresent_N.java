package J_27_DP_1;

import java.util.Scanner;

public class MinSquareToRepresent_N {
    // Brute-force recurrsive Method.
    public static int minsquare(int n) {
        if (n == 0) {
            return 0;
        }
        int minans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int currans = minsquare(n - (i * i));
            if (minans > currans) {
                minans = currans;
            }
        }
        int finalans = minans + 1;
        return finalans;
    }
    // Recurrsive DP Method
    public static int minsquare(int n, int dp[]) {
        if (n == 0) {
            return 0;
        }
        int minans = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int currans;
            if (dp[n - (i * i)] == -1) {
                currans = minsquare(n - (i * i), dp);
                dp[n - (i * i)] = currans;
            } else {
                currans = dp[n - (i * i)];
            }
            if (minans > currans) {
                minans = currans;
            }
        }
        int finalans = minans + 1;
        return finalans;
    }
    // Iterative DP Method
    public static int minsquareI(int n)
    {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 1; i <= n; i++)
        {
            int minans = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++)
            {
                int currans = dp[i-(j*j)];
                if(minans > currans)
                {
                    minans = currans;
                }
            }
            dp[i] = minans+1;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dp[] = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = minsquare(n,dp);
        System.out.println(ans);
        s.close();
    }
}