package io.krats.topcoder.dp.div2.level1;

import java.util.Arrays;

public class SRMCards {
    public int maxTurns(int[] cards) {
        if (cards.length == 1) {
            return 1;
        }
        Arrays.sort(cards);
        int ans = 0;
        int i = 0;
        while (i < cards.length) {
            ans += 1;
            if (i != cards.length - 1 && cards[i] == cards[i + 1] - 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return ans;
    }
}
