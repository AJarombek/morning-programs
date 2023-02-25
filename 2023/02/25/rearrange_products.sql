-- https://leetcode.com/problems/rearrange-products-table/
-- Author: Andrew Jarombek
-- Date: 2/25/2023

-- MySQL

SELECT product_id, 'store1' AS store, store1 AS price
FROM Products
WHERE store1 IS NOT NULL
UNION ALL
SELECT product_id, 'store2' AS store, store2 AS price
FROM Products
WHERE store2 IS NOT NULL
UNION ALL
SELECT product_id, 'store3' AS store, store3 AS price
FROM Products
WHERE store3 IS NOT NULL

-- Oracle

SELECT * FROM Products
UNPIVOT (
    store
    FOR price
    IN (
        store1 AS 'store1',
        store2 AS 'store2',
        store3 AS 'store3'
    )
)
