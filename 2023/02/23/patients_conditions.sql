-- https://leetcode.com/problems/patients-with-a-condition/
-- Author: Andrew Jarombek
-- Date: 2/23/2023

SELECT * FROM Patients
WHERE conditions LIKE 'DIAB1%'
OR conditions LIKE '% DIAB1%'