# Write your MySQL query statement below
-- select emp.name as Employee
-- from 
-- Employee emp
-- inner join
-- Employee mgr
-- on emp.managerId = mgr.id
-- where emp.salary>mgr.salary


select name as Employee
from Employee emp
where salary>(
    select salary from
    Employee mgr
    where emp.managerId = mgr.id
)

-- select * from
-- Employee emp
-- inner join
-- Employee mgr
-- on emp.managerId = mgr.id