# ==========================================================
# 605. Can Place Flowers
# Difficulty : Easy
# Language   : Python
# Solution   : #1
# Runtime    : 12 ms (Beats 26%)
# Memory     : 19.5 MB (Beats 80%)
# Link       : https://leetcode.com/problems/can-place-flowers/
# ==========================================================

class Solution:
    def canPlaceFlowers(self, flowerbed: list[int], n: int) -> bool:
        if n == 0:
            return True

        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                left_empty = (i == 0 or flowerbed[i - 1] == 0)
                right_empty = (i == len(flowerbed) - 1 or flowerbed[i + 1] == 0)

                if left_empty and right_empty:
                    flowerbed[i] = 1
                    n -= 1

                    if n == 0:
                        return True

        return False