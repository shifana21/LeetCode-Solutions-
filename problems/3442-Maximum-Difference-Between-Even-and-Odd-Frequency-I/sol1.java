// ==========================================================
// 3442. Maximum Difference Between Even and Odd Frequency I
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 54%)
// Memory     : 43.1 MB (Beats 99%)
// Link       : https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/
// ==========================================================

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f % 2 == 1) {
                maxOdd = Math.max(maxOdd, f);
            } else if (f > 0) {
                minEven = Math.min(minEven, f);
            }
        }

        return maxOdd - minEven;
    }
}