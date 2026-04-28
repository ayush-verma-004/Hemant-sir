package ques33;

public class Ques33 {
    public static int longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s1 = "abcde", s2 = "abfce";
        System.out.println("S1: " + s1 + ", S2: " + s2);
        System.out.println("Longest Common Substring Length: " + longestCommonSubstring(s1, s2));
    }
}
