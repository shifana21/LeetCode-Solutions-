-- ========================================================
-- 607. Sales Person
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 1460 ms (Beats 69%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/sales-person/
-- ========================================================

SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);