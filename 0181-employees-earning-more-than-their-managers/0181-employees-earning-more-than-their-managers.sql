/* Write your T-SQL query statement below */

SELECT 
e.name AS Employee

FROM Employee e
JOIN Employee m on e.managerId = m.id
Where e.salary > m.salary;


