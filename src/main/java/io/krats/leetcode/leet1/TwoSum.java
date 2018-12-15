package io.krats.leetcode.leet1;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ans[0] + ' ' + ans[1]);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(seen.containsKey(target - nums[i])) {
                return new int[]{seen.get(target - nums[i]), i};
            }
            seen.put(nums[i], i);
        }
        return null;
    }
}
