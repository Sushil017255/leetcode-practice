# Write your MySQL query statement below
SELECT
 name
 FROM 
 customer
 WHERE  
 # referee_id is NULL OR referee_id != 2
 IFNULL(referee_id, 0) <> 2