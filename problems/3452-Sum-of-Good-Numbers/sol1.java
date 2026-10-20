// ==========================================================
// 3452. Sum of Good Numbers
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 97%)
// Memory     : 44.8 MB (Beats 97%)
// Link       : https://leetcode.com/problems/sum-of-good-numbers/
// ==========================================================

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean good = true;

            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                good = false;
            }

            if (i + k < n && nums[i] <= nums[i + k]) {
                good = false;
            }

            if (good) {
                sum += nums[i];
            }
        }

        return sum;
    }
}