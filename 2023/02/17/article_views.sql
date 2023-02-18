-- https://leetcode.com/problems/article-views-i/
-- Author: Andrew Jarombek
-- Date: 2/17/2023

SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id ASC