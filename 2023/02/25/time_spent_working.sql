-- https://leetcode.com/problems/find-total-time-spent-by-each-employee/
-- Author: Andrew Jarombek
-- Date: 2/25/2023

SELECT event_day AS day, emp_id, SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id