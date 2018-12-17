package io.krats.topcoder.dp.div2.level1;

public class ShorterSuperSum {
    public 	int calculate(int k, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = i+1;
        }
        for (int i = 1; i <= k ; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
}
