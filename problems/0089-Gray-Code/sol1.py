# ==========================================================
# 89. Gray Code
# Difficulty : Medium
# Language   : Python
# Solution   : #1
# Runtime    : 6 ms (Beats 76%)
# Memory     : 22.7 MB (Beats 15%)
# Link       : https://leetcode.com/problems/gray-code/
# ==========================================================

class Solution:
    def grayCode(self, n: int) -> list[int]:
        result = []

        for i in range(1 << n):
            result.append(i ^ (i >> 1))

        return result