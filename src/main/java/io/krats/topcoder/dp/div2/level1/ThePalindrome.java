package io.krats.topcoder.dp.div2.level1;

public class ThePalindrome {
    public int find(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true;
                } else if(len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = dp[i+1][j-1] && s.charAt(i) == s.charAt(j);
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(dp[i][s.length()-1]) {
                return s.length() + i;
            }
        }
        return 0;
    }
}
