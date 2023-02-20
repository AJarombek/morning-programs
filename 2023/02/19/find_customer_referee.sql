-- https://leetcode.com/problems/find-customer-referee/
-- Author: Andrew Jarombek
-- Date: 2/19/2023

SELECT name
FROM Customer
WHERE referee_id IS NULL
OR referee_id <> 2