package io.krats.topcoder.dp.div2.level2;

public class RGBStreet {
    public static void main(String[] args) {
        RGBStreet rgbStreet = new RGBStreet();
        System.out.println(rgbStreet.estimateCost(new String[]{"71 39 44", "32 83 55", "51 37 63", "89 29 100",
                "83 58 11", "65 13 15", "47 25 29", "60 66 19"}));
    }

    public int estimateCost(String[] houses) {
        int[][] costs = new int[houses.length + 1][3];
        for (int i = 1; i <= houses.length; i++) {
            String[] curCost = houses[i - 1].split("\\s+");
            int r = Integer.parseInt(curCost[0]);
            int g = Integer.parseInt(curCost[1]);
            int b = Integer.parseInt(curCost[2]);
            costs[i][0] = Math.min(costs[i - 1][1], costs[i - 1][2]) + r;
            costs[i][1] = Math.min(costs[i - 1][2], costs[i - 1][0]) + g;
            costs[i][2] = Math.min(costs[i - 1][0], costs[i - 1][1]) + b;
        }
        return Math.min(costs[houses.length][0], Math.min(costs[houses.length][1], costs[houses.length][2]));
    }
}
