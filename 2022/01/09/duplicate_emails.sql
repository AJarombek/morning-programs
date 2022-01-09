-- https://leetcode.com/problems/duplicate-emails/
-- Author: Andrew Jarombek
-- Date: 1/9/2022

SELECT email FROM (
    SELECT email, COUNT(email) AS email_count
    FROM Person
    GROUP BY email
) AS e
WHERE email_count > 1;

-- Second Approach (Slightly Faster)
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1
