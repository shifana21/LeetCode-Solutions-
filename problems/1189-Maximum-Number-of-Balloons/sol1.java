// ==========================================================
// 1189. Maximum Number of Balloons
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 96%)
// Memory     : 42.9 MB (Beats 94%)
// Link       : https://leetcode.com/problems/maximum-number-of-balloons/
// ==========================================================

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];

        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        count['l' - 'a'] /= 2;
        count['o' - 'a'] /= 2;

        return Math.min(
            Math.min(count['b' - 'a'], count['a' - 'a']),
            Math.min(
                Math.min(count['l' - 'a'], count['o' - 'a']),
                count['n' - 'a']
            )
        );
    }
}