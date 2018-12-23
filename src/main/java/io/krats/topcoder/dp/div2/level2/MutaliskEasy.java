package io.krats.topcoder.dp.div2.level2;

public class MutaliskEasy {

  public int minimalAttacks(int[] x) {
    int[][][] dp = new int[61][61][61];
    for (int i = 0; i < 61; i++) {
      for (int j = i; j < 61; j++) {
        for (int k = j; k < 61; k++) {
          if (i == 0 && j == 0 && k == 0) {
            continue;
          }
          int cur = Integer.MAX_VALUE;
          cur = Math.min(cur, dp[Math.max(i - 9, 0)][Math.max(j - 3, 0)][Math.max(k - 1, 0)]);
          cur = Math.min(cur, dp[Math.max(i - 9, 0)][Math.max(j - 1, 0)][Math.max(k - 3, 0)]);
          cur = Math.min(cur, dp[Math.max(i - 3, 0)][Math.max(j - 1, 0)][Math.max(k - 9, 0)]);
          cur = Math.min(cur, dp[Math.max(i - 3, 0)][Math.max(j - 9, 0)][Math.max(k - 1, 0)]);
          cur = Math.min(cur, dp[Math.max(i - 1, 0)][Math.max(j - 3, 0)][Math.max(k - 9, 0)]);
          cur = Math.min(cur, dp[Math.max(i - 1, 0)][Math.max(j - 9, 0)][Math.max(k - 3, 0)]);
          dp[i][j][k] = cur + 1;
          dp[i][k][j] = cur + 1;
          dp[j][k][i] = cur + 1;
          dp[j][i][k] = cur + 1;
          dp[k][i][j] = cur + 1;
          dp[k][j][i] = cur + 1;
        }
      }
    }
    return dp[x[0]][x.length > 1 ? x[1] : 0][x.length > 2 ? x[2] : 0];
  }
}