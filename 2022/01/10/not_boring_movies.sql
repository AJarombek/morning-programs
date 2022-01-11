-- https://leetcode.com/problems/not-boring-movies/
-- Author: Andrew Jarombek
-- Date: 1/10/2022

SELECT * FROM Cinema
WHERE id % 2 = 1
AND description <> 'boring'
ORDER BY rating DESC;