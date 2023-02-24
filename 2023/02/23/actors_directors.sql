-- https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/
-- Author: Andrew Jarombek
-- Date: 2/23/2023

SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(timestamp) > 2