-- https://leetcode.com/problems/bank-account-summary-ii/
-- Author: Andrew Jarombek
-- Date: 2/24/2023

SELECT name, SUM(amount) AS balance
FROM Users AS u
INNER JOIN Transactions AS t
ON u.account = t.account
GROUP BY name
HAVING balance > 10000