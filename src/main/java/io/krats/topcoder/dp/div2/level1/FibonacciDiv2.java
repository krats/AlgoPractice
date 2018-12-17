package io.krats.topcoder.dp.div2.level1;

public class FibonacciDiv2 {
    public int find(int N) {
        int a = 0;
        int b = 1;
        while (b <= N) {
            b = a + b;
            a = b - a;
        }
        return Math.min(N-a, b - N);
    }
}
