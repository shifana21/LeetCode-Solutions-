# ==========================================================
# 190. Reverse Bits
# Difficulty : Easy
# Language   : Python
# Solution   : #1
# Runtime    : 4 ms (Beats 64%)
# Memory     : 19.1 MB (Beats 73%)
# Link       : https://leetcode.com/problems/reverse-bits/
# ==========================================================

class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0

        for i in range(32):
            result = (result << 1) | (n & 1)
            n >>= 1

        return result