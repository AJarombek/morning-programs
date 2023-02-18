-- https://leetcode.com/problems/game-play-analysis-i/
-- Author: Andrew Jarombek
-- Date: 2/17/2023

SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id