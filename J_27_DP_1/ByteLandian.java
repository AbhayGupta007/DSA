package J_27_DP_1;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteLandian {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        if (n <= 1) {
            return n;
        }
        long ans2 =Integer.MIN_VALUE;
        long ans3 =Integer.MIN_VALUE;
        long ans4 =Integer.MIN_VALUE;
        if (!memo.containsKey(n/2)) {
            ans2 = bytelandian(n/2, memo);
            memo.put(n/2, ans2);
        }
        else
        {
            ans2 = memo.get(n/2);
        }
        if (!memo.containsKey(n/3)) {
            ans3 = bytelandian(n/3, memo);
            memo.put(n/3, ans3);
        }
        else
        {
            ans3 = memo.get(n/3);
        }
        if (!memo.containsKey(n/4)) {
            ans4 = bytelandian(n/4, memo);
            memo.put(n/4, ans4);
        }
        else
        {
            ans4 = memo.get(n/4);
        }
        long sum = ans2+ ans3+ ans4;
        long ans = Math.max(n, sum);
        return ans;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        long n = Long.parseLong(br.readLine().trim());
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        System.out.println(bytelandian(n, memo));
    }
}