package J_27_DP_1;

import java.util.Scanner;

public class StairCase {

    public static long staircase(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long ans = staircase(n);
        System.out.println(ans);
        s.close();
    }
}