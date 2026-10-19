# ==========================================================
# 96. Unique Binary Search Trees
# Difficulty : Medium
# Language   : Python
# Solution   : #1
# Runtime    : 0 ms (Beats 100%)
# Memory     : 19.3 MB (Beats 59%)
# Link       : https://leetcode.com/problems/unique-binary-search-trees/
# ==========================================================

class Solution:
    def numTrees(self, n: int) -> int:
        dp = [0] * (n + 1)
        dp[0] = 1
        dp[1] = 1

        for nodes in range(2, n + 1):
            for root in range(1, nodes + 1):
                left = root - 1
                right = nodes - root
                dp[nodes] += dp[left] * dp[right]

        return dp[n]