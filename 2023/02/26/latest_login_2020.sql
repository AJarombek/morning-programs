-- https://leetcode.com/problems/the-latest-login-in-2020/
-- Author: Andrew Jarombek
-- Date: 2/26/2023

SELECT user_id, MAX(time_stamp) AS last_stamp
FROM Logins
WHERE time_stamp LIKE '2020%'
GROUP BY user_id