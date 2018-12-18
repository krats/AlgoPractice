package io.krats.topcoder.dp.div2.level2;

public class NumberofFiboCalls {
    public int[] fiboCallsMade(int n) {
        int a = 0, na0 = 1, na1 = 0;
        int b = 1, nb0 = 0, nb1 = 1;
        int i = 2;
        if (n == 0) {
            return new int[]{1, 0};
        } else if (n == 1) {
            return new int[]{0, 1};
        } else {
            while (i <= n) {
                i++;
                b = a + b;
                a = b - a;
                nb0 = na0 + nb0;
                nb1 = na1 + nb1;
                na0 = -na0 + nb0;
                na1 = -na1 + nb1;
            }
        }
        return new int[]{nb0, nb1};
    }

//    public int[] fiboCallsMade(int n) {
//        int[][] dp = new int[2][n+3];
//        dp[0][0] = 1;
//        dp[1][0] = 0;
//        dp[0][1] = 0;
//        dp[1][1] = 1;
//        for(int i=2; i<=n; i++) {
//            dp[0][i] = dp[0][i-1] + dp[0][i-2];
//            dp[1][i] = dp[1][i-1] + dp[1][i-2];
//        }
//        return new int[] { dp[0][n], dp[1][n] };
//    }
}
