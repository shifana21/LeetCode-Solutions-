-- ========================================================
-- 596. Classes With at Least 5 Students
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 396 ms (Beats 22%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/classes-with-at-least-5-students/
-- ========================================================

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;