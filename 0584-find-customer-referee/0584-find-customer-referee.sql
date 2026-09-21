/* Write your T-SQL query statement below */

SELECT 
name 
From Customer 
Where referee_id <> 2 OR referee_id is NULL;