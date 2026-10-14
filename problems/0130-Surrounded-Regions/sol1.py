# ==========================================================
# 130. Surrounded Regions
# Difficulty : Medium
# Language   : Python
# Solution   : #1
# Runtime    : 3 ms (Beats 84%)
# Memory     : 22.4 MB (Beats 43%)
# Link       : https://leetcode.com/problems/surrounded-regions/
# ==========================================================

class Solution:
    def solve(self, board: list[list[str]]) -> None:
        if not board:
            return

        m, n = len(board), len(board[0])

        def dfs(r, c):
            if r < 0 or r >= m or c < 0 or c >= n:
                return
            if board[r][c] != 'O':
                return

            board[r][c] = '#'

            dfs(r + 1, c)
            dfs(r - 1, c)
            dfs(r, c + 1)
            dfs(r, c - 1)

        # Step 1: Protect O's connected to the border
        for r in range(m):
            dfs(r, 0)
            dfs(r, n - 1)

        for c in range(n):
            dfs(0, c)
            dfs(m - 1, c)

        # Step 2: Capture surrounded O's and restore protected cells
        for r in range(m):
            for c in range(n):
                if board[r][c] == 'O':
                    board[r][c] = 'X'
                elif board[r][c] == '#':
                    board[r][c] = 'O'