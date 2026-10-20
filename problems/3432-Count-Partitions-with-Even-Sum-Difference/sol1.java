// ==========================================================
// 3432. Count Partitions with Even Sum Difference
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 52%)
// Memory     : 42.9 MB (Beats 99%)
// Link       : https://leetcode.com/problems/count-partitions-with-even-sum-difference/
// ==========================================================

class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;

            if ((leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}