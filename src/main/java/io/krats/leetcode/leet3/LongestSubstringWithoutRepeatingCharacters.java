package io.krats.leetcode.leet3;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("bpfbhmipx"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max_len = 0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                max_len = Math.max(max_len, map.size());
                int idx = map.get(s.charAt(i));
                while (idx >= 0 && map.containsKey(s.charAt(idx)) && map.get(s.charAt(idx)) == idx) {
                    map.remove(s.charAt(idx));
                    idx--;
                }
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(max_len, map.size());
    }
}