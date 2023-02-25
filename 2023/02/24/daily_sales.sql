-- https://leetcode.com/problems/daily-leads-and-partners/
-- Author: Andrew Jarombek
-- Date: 2/24/2023

SELECT
    date_id,
    make_name,
    COUNT(DISTINCT lead_id) AS unique_leads,
    COUNT(DISTINCT partner_id) AS unique_partners
FROM DailySales
GROUP BY date_id, make_name