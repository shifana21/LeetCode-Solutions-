-- ========================================================
-- 595. Big Countries
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 303 ms (Beats 63%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/big-countries/
-- ========================================================

# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;