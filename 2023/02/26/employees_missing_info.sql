-- https://leetcode.com/problems/employees-with-missing-information/
-- Author: Andrew Jarombek
-- Date: 2/26/2023

-- MySQL

SELECT e.employee_id
FROM Employees e
LEFT OUTER JOIN Salaries s
ON e.employee_id = s.employee_id
WHERE salary IS NULL
UNION
SELECT s.employee_id
FROM Salaries s
LEFT OUTER JOIN Employees e
ON s.employee_id = e.employee_id
WHERE name IS NULL
ORDER BY employee_id

-- Oracle

SELECT COALESCE(e.employee_id, s.employee_id) AS employee_id
FROM Employees e
FULL OUTER JOIN Salaries s
ON e.employee_id = s.employee_id
WHERE name IS NULL
OR salary IS NULL
ORDER BY employee_id
