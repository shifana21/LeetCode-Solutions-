# ==========================================================
# 350. Intersection of Two Arrays II
# Difficulty : Easy
# Language   : Python
# Solution   : #1
# Runtime    : 0 ms (Beats 100%)
# Memory     : 19.5 MB (Beats 20%)
# Link       : https://leetcode.com/problems/intersection-of-two-arrays-ii/
# ==========================================================

from collections import Counter

class Solution:
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        count = Counter(nums1)
        result = []

        for num in nums2:
            if count[num] > 0:
                result.append(num)
                count[num] -= 1

        return result