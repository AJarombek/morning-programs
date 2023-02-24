-- https://leetcode.com/problems/sales-person/
-- Author: Andrew Jarombek
-- Date: 2/23/2023

SELECT name
FROM SalesPerson
WHERE name NOT IN (
    SELECT DISTINCT s.name
    FROM SalesPerson s
    LEFT JOIN Orders o
        ON s.sales_id = o.sales_id
    LEFT JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
)
