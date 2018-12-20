package io.krats.topcoder.dp.div2.level2;

public class DivFreed2 {

  public int count(int n, int k) {
    long[][] dp = new long[n + 1][k + 1];
    int mod = 1000000007;
    for (int i = 1; i <= k; i++) {
      dp[1][i] = 1;
    }
    long prevSum = k;
    long curSum = 0;
    for (int i = 2; i <= n; i++) {
      curSum = 0;
      for (int j = 1; j <= k; j++) {
        long cur = prevSum;
        for (int l = 2 * j; l <= k; l += j) {
          cur = (cur - dp[i - 1][l]) % mod;
        }
        dp[i][j] = cur;
        curSum = (cur + curSum) % mod;
      }
      prevSum = curSum;
    }
    return (int) prevSum;
  }
}
