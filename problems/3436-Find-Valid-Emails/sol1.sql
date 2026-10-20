-- ========================================================
-- 3436. Find Valid Emails
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 510 ms (Beats 42%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/find-valid-emails/
-- ========================================================

SELECT user_id, email
FROM Users
WHERE email REGEXP '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$'
ORDER BY user_id ASC;