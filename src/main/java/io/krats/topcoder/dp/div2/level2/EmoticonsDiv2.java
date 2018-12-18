package io.krats.topcoder.dp.div2.level2;

public class EmoticonsDiv2 {
  public int printSmiles(int smiles) {
    int[] dp = new int[smiles+1];
    for (int i = 2; i <= smiles ; i++) {
      dp[i] = i;
      int a = 2;
      while (i/a > 1) {
        if(i%a == 0) {
          dp[i] = Math.min(dp[i], dp[i/a] + a);
        }
        a++;
      }
    }
    return dp[smiles];
  }
}
