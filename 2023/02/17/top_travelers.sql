-- https://leetcode.com/problems/top-travellers/
-- Author: Andrew Jarombek
-- Date: 2/17/2023

SELECT MAX(name) AS name, COALESCE(SUM(distance), 0) AS travelled_distance
FROM Users u LEFT JOIN Rides r
    ON u.id = r.user_id
GROUP BY user_id
ORDER BY travelled_distance DESC, name ASC