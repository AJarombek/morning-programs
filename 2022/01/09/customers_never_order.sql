-- https://leetcode.com/problems/customers-who-never-order/
-- Author: Andrew Jarombek
-- Date: 1/9/2022

SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId FROM Orders GROUP BY customerId
)

-- Slightly Faster
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId FROM Orders
)