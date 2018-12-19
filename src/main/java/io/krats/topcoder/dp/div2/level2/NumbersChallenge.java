package io.krats.topcoder.dp.div2.level2;

import java.util.Arrays;

public class NumbersChallenge {
    public int MinNumber(int[] S) {
        int idx = 0;
        Arrays.sort(S);
        for (int i: S) {
            int prevIdx = idx;
            for (int j = 0; j <= prevIdx; j++) {
                if(j + i > idx+1) {
                    return idx+1;
                } else if(idx+1 == j + i) {
                    idx += 1;
                }
            }
        }
        return idx+1;
    }
}
