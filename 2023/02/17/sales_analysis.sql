-- https://leetcode.com/problems/sales-analysis-iii/
-- Author: Andrew Jarombek
-- Date: 2/17/2023

SELECT product_id, product_name FROM (
    SELECT p.product_id, product_name, MAX(sale_date) AS max_sale_date, MIN(sale_date) AS min_sale_date
    FROM Product p
    INNER JOIN Sales s
    ON p.product_id = s.product_id
    GROUP BY p.product_id
) AS sale_dates
WHERE min_sale_date >= '2019-01-01'
AND max_sale_date <= '2019-03-31'
