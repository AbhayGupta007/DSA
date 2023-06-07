/*LCS - Problem
Send Feedback
Given two strings, 'S' and 'T' with lengths 'M' and 'N', find the length of the 'Longest Common Subsequence'.
For a string 'str'(per se) of length K, the subsequences are the strings containing characters in the same relative order as they are present in 'str,' but not
 necessarily contiguous. Subsequences contain all the strings of length varying from 0 to K.
Example :
Subsequences of string "abc" are:  ""(empty string), a, b, c, ab, bc, ac, abc.
Input format :
The first line of input contains the string 'S' of length 'M'.

The second line of the input contains the string 'T' of length 'N'.
Output format :
Return the length of the Longest Common Subsequence.
Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3

Time Limit: 1 sec
Sample Input 1 :
adebc
dcadb
Sample Output 1 :
3
Explanation of the Sample Output 1 :
Both the strings contain a common subsequence 'adb', which is the longest common subsequence with length 3. 
Sample Input 2 :
ab
defg
Sample Output 2 :
0
Explanation of the Sample Output 2 :
The only subsequence that is common to both the given strings is an empty string("") of length 0. */

package J_28_DP_2;

public class LCS {
    // Brute force recurrsion method.
    public static int lcs(String s, String t) {
        int result = helper(s, t, 0, 0);
        return result;
    }

    public static int helper(String s, String t, int i, int j) {
        if (i == s.length() || j == t.length()) {
            return 0;
        }
        int length = 0;
        if (s.charAt(i) == t.charAt(j)) {
            length = 1 + helper(s, t, i + 1, j + 1);
        } else {
            int ans1 = helper(s, t, i + 1, j);
            int ans2 = helper(s, t, i, j + 1);
            length = Math.max(ans1, ans2);
        }
        return length;
    }

    // Recurrsion DP method.
    public static int lcs_DP_R(String s, String t, int i, int j, int dp[][]) {
        if (i == s.length() || j == t.length()) {
            return 0;
        }
        int length = 0;
        if (s.charAt(i) == t.charAt(j)) {
            int temp = 0;
            if (dp[i + 1][j + 1] == -1) {
                temp = lcs_DP_R(s, t, i + 1, j + 1, dp);
                dp[i + 1][j + 1] = temp;
            } else {
                temp = dp[i + 1][j + 1];
            }
            length = 1 + temp;
        } else {
            int ans1, ans2;
            if (dp[i + 1][j] == -1) {
                ans1 = lcs_DP_R(s, t, i + 1, j, dp);
                dp[i + 1][j] = ans1;
            } else {
                ans1 = dp[i + 1][j];
            }
            if (dp[i][j + 1] == -1) {
                ans2 = lcs_DP_R(s, t, i, j + 1, dp);
                dp[i][j + 1] = ans2;
            } else {
                ans2 = dp[i][j + 1];
            }
            length = Math.max(ans1, ans2);
        }
        return length;
    }

    // Iterative DP method
    public static int lcs_DP_I(String s, String t) 
    {
        int dp[][] = new int[s.length()+1][t.length()+1];
        for(int i = 0; i< dp.length; i++)
        {
            for(int j = 0; j<dp[0].length; j++)
            {
                dp[i][j] = 0;
            }
        }
        for(int i = s.length()-1; i >= 0; i--)
        {
            for(int j = t.length()-1; j >= 0; j--)
            {
                if(i == j)
                {
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {

    }
}