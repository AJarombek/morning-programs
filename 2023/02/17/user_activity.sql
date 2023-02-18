-- https://leetcode.com/problems/user-activity-for-the-past-30-days-i/
-- Author: Andrew Jarombek
-- Date: 2/17/2023

SELECT MAX(activity_date) AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-28'
GROUP BY activity_date