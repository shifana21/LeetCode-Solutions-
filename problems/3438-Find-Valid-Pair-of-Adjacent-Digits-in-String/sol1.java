// ==========================================================
// 3438. Find Valid Pair of Adjacent Digits in String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 43%)
// Memory     : 43.7 MB (Beats 92%)
// Link       : https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/
// ==========================================================

class Solution {
    public String findValidPair(String s) {
        int[] count = new int[10];

        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            if (a != b &&
                count[a - '0'] == a - '0' &&
                count[b - '0'] == b - '0') {
                return "" + a + b;
            }
        }

        return "";
    }
}