package io.krats.topcoder.dp.div2.level2;

public class TrafficCongestionDivTwo {
    public static void main(String[] args) {
        TrafficCongestionDivTwo trafficCongestionDivTwo = new TrafficCongestionDivTwo();
        System.out.println(trafficCongestionDivTwo.theMinCars(60));
    }

    public long theMinCars(int treeHeight) {
        long[] dp = new long[treeHeight + 1];
        dp[0] = 1;
        for (int i = 1; i <= treeHeight; i++) {
            dp[i] = 2 * dp[i - 1] + 1;
            long ans = 1;
            for (int j = 1; j < i; j++) {
                ans += 2 * dp[j - 1];
            }
            dp[i] = Math.min(dp[i], ans);
        }
        return dp[treeHeight];
    }
}
