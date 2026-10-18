-- ========================================================
-- 610. Triangle Judgement
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 402 ms (Beats 12%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/triangle-judgement/
-- ========================================================

SELECT
    x,
    y,
    z,
    CASE
        WHEN x + y > z
         AND x + z > y
         AND y + z > x
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;