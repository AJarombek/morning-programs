-- https://leetcode.com/problems/classes-more-than-5-students/
-- Author: Andrew Jarombek
-- Date: 1/10/2022

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(class) >= 5;