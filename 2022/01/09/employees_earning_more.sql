-- https://leetcode.com/problems/employees-earning-more-than-their-managers/
-- Author: Andrew Jarombek
-- Date: 1/9/2022

SELECT e.name AS Employee
FROM Employee e
INNER JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;