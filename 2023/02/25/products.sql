-- https://leetcode.com/problems/recyclable-and-low-fat-products/
-- Author: Andrew Jarombek
-- Date: 2/25/2023

SELECT product_id
FROM Products
WHERE low_fats = 'Y'
AND recyclable = 'Y'