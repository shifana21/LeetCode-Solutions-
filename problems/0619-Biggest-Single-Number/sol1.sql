-- ========================================================
-- 619. Biggest Single Number
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 479 ms (Beats 41%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/biggest-single-number/
-- ========================================================

SELECT MAX(num) AS num
FROM MyNumbers
WHERE num IN (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
);