-- https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/
-- Author: Andrew Jarombek
-- Date: 2/24/2023

SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id