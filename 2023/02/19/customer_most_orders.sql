-- https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
-- Author: Andrew Jarombek
-- Date: 2/19/2023

SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(order_number) DESC
LIMIT 1