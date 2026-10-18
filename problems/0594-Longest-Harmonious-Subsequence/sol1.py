# ==========================================================
# 594. Longest Harmonious Subsequence
# Difficulty : Easy
# Language   : Python
# Solution   : #1
# Runtime    : 17 ms (Beats 90%)
# Memory     : 20.9 MB (Beats 34%)
# Link       : https://leetcode.com/problems/longest-harmonious-subsequence/
# ==========================================================

from collections import Counter

class Solution:
    def findLHS(self, nums: list[int]) -> int:
        count = Counter(nums)
        longest = 0

        for num in count:
            if num + 1 in count:
                longest = max(longest, count[num] + count[num + 1])

        return longest