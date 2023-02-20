-- https://leetcode.com/problems/group-sold-products-by-the-date/
-- Author: Andrew Jarombek
-- Date: 2/19/2023

SELECT sell_date, COUNT(DISTINCT product) AS num_sold, GROUP_CONCAT(DISTINCT product) AS products
FROM Activities
GROUP BY sell_date