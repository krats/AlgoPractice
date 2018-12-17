package io.krats.topcoder.dp.div2.level2;

public class ColorfulRoad {
  public int getMin(String road) {
    int[] dp = new int[road.length()];
    dp[road.length()-1] = 0;
    for (int i = road.length() - 2; i >= 0; i--) {
      dp[i] = Integer.MAX_VALUE;
      char next = road.charAt(i) == 'R' ? 'G' : (road.charAt(i) == 'G' ? 'B' : 'R');
      for (int j = i + 1; j < road.length(); j++) {
        if (next == road.charAt(j) && dp[j] != Integer.MAX_VALUE) {
          dp[i] = Math.min(dp[i], dp[j] + (int) Math.pow(j - i, 2));
        }
      }
    }
    if(dp[0] == Integer.MAX_VALUE) {
      return -1;
    } else {
      return dp[0];
    }
  }
}
