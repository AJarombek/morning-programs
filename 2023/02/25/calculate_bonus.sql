-- https://leetcode.com/problems/calculate-special-bonus/
-- Author: Andrew Jarombek
-- Date: 2/25/2023

SELECT
    employee_id,
    CASE
        WHEN employee_id % 2 = 1 AND name NOT LIKE 'M%' THEN salary
        ELSE 0
        END AS bonus
FROM Employees
ORDER BY employee_id
