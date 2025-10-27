# Write your MySQL query statement below
SELECT e.Name AS Employee
FROM Employee e
WHERE e.Salary > (
  SELECT m.Salary
  FROM Employee m 
  WHERE m.id = e.ManagerId); 