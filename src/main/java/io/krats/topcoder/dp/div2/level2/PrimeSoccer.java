package io.krats.topcoder.dp.div2.level2;
import java.util.*;
        import java.math.*;
        import static java.lang.Math.*;

public class PrimeSoccer {

    public double getProbability(int skillOfTeamA, int skillOfTeamB) {
        int[] c = {1, 18, 153, 816, 3060, 8568, 18564, 31824, 43758, 48620, 43758, 31824, 18564, 8568, 3060, 816, 153, 18, 1};
        int[] nonPrimes = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18};
        double p1 = ((double) skillOfTeamA)/100;
        double p2 = ((double) skillOfTeamB)/100;
        double ans;
        double t1=0,t2=0;
        for(int i=0; i<12; i++)
        {
            t1 += c[nonPrimes[i]]*Math.pow(p1,nonPrimes[i])*Math.pow(1-p1,18-nonPrimes[i]);
            t2 += c[nonPrimes[i]]*Math.pow(p2,nonPrimes[i])*Math.pow(1-p2,18-nonPrimes[i]);
        }
        ans = 1-t1*t2;
        return ans;
    }
//    Not a correct solution
//    public double getProbability(int skillOfTeamA, int skillOfTeamB) {
//        double ans = 0.0;
//        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17};
//        int[] c = {1, 18, 153, 816, 3060, 8568, 18564, 31824, 43758, 48620, 43758, 31824, 18564, 8568, 3060, 816, 153, 18, 1};
//        double p1=0.0,p2=0.0,p1p2=0.0;
//        for (int item : primes) {
//            p1 += c[item]*Math.pow(skillOfTeamA / 100.0, item) * Math.pow((1 - skillOfTeamB) / 100.0, item)
//                    * Math.pow((1 - skillOfTeamA) / 100.0, 18 - item);
//            p2 += c[item]*Math.pow(skillOfTeamB / 100.0, item) * Math.pow((1 - skillOfTeamA) / 100.0, item)
//                    * Math.pow((1 - skillOfTeamB) / 100.0, 18 - item);
//        }
//        for (int i = 0; i < primes.length; i++) {
//            for (int j = i; j < primes.length; j++) {
//                if (primes[i] + primes[j] <= 18) {
//                    if(i == j) {
//                        p1p2 += c[primes[i]]*Math.pow(skillOfTeamA / 100.0, primes[i]) * Math.pow((1 - skillOfTeamA) / 100.0, 18 - primes[i])
//                                * Math.pow(skillOfTeamB / 100.0, primes[j]) * Math.pow((1 - skillOfTeamB) / 100.0, 18 - primes[j]);
//                    } else {
//                        p1p2 += c[primes[i]] * c[primes[j]] * Math.pow(skillOfTeamA / 100.0, primes[i]) * Math.pow((1 - skillOfTeamA) / 100.0, 18 - primes[i])
//                                * Math.pow(skillOfTeamB / 100.0, primes[j]) * Math.pow((1 - skillOfTeamB) / 100.0, 18 - primes[j]);
//                        p1p2 += c[primes[i]] * c[primes[j]] * Math.pow(skillOfTeamB / 100.0, primes[i]) * Math.pow((1 - skillOfTeamB) / 100.0, 18 - primes[i])
//                                * Math.pow(skillOfTeamA / 100.0, primes[j]) * Math.pow((1 - skillOfTeamA) / 100.0, 18 - primes[j]);
//                    }
//                }
//            }
//        }
//        return p1+p2-p1p2;
//    }
}

