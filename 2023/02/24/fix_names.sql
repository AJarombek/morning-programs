-- https://leetcode.com/problems/fix-names-in-a-table/
-- Author: Andrew Jarombek
-- Date: 2/24/2023

SELECT
    user_id,
    CONCAT(UPPER(SUBSTRING(name, 1, 1)), LOWER(SUBSTRING(name, 2))) AS name
FROM Users
ORDER BY user_id