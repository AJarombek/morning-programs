-- https://leetcode.com/problems/big-countries/
-- Author: Andrew Jarombek
-- Date: 1/10/2022

SELECT name, population, area
FROM World
WHERE area >= 3000000
OR population >= 25000000