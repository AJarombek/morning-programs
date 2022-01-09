-- https://leetcode.com/problems/combine-two-tables/
-- Author: Andrew Jarombek
-- Date: 1/9/2022

SELECT firstName, lastName, city, state
FROM Person
LEFT OUTER JOIN Address
    ON Person.personId = Address.personId;