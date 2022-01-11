-- https://leetcode.com/problems/delete-duplicate-emails/
-- Author: Andrew Jarombek
-- Date: 1/10/2022

DELETE FROM Person WHERE id IN (
    SELECT id FROM (
        SELECT
            id,
            email,
            RANK() OVER (PARTITION BY email ORDER BY id) email_rank
        FROM Person
    ) AS PersonRank
    WHERE email_rank > 1
);