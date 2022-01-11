-- https://leetcode.com/problems/rising-temperature/
-- Author: Andrew Jarombek
-- Date: 1/10/2022

SELECT w.id
FROM Weather w
INNER JOIN Weather y
    ON y.recordDate = w.recordDate - INTERVAL 1 DAY
WHERE w.temperature > y.temperature