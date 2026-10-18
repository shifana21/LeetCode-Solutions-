# ==========================================================
# 599. Minimum Index Sum of Two Lists
# Difficulty : Easy
# Language   : Python
# Solution   : #1
# Runtime    : 2 ms (Beats 96%)
# Memory     : 19.7 MB (Beats 29%)
# Link       : https://leetcode.com/problems/minimum-index-sum-of-two-lists/
# ==========================================================

class Solution:
    def findRestaurant(self, list1: list[str], list2: list[str]) -> list[str]:
        index_map = {word: i for i, word in enumerate(list1)}

        result = []
        min_sum = float('inf')

        for j, word in enumerate(list2):
            if word in index_map:
                total = index_map[word] + j

                if total < min_sum:
                    min_sum = total
                    result = [word]
                elif total == min_sum:
                    result.append(word)

        return result