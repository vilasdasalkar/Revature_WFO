use revainfo;
INSERT INTO revature_emp (Emp_id, Emp_name, salary, age) VALUES (6, 'elas ', 7500, 24),(2, 'abhi', 7500, 28),
(3, 'pratik', 5000, 35),(4, 'varun', 6500, 40),(5, 'Brown', 7000, 45);



select * from dept;
INSERT INTO dept (Dept_id, Dept_name) VALUES
(1, 'Human Resources'),
(2, 'Finance'),
(3, 'Engineering'),
(4, 'Marketing'),
(5, 'Sales');
ALTER TABLE dept ADD COLUMN Emp_id INTEGER;
ALTER TABLE dept
ADD CONSTRAINT fk_emp_id
FOREIGN KEY (Emp_id) REFERENCES revature_emp(Emp_id);
select * from dept;
UPDATE dept
SET Emp_id = 1
WHERE Dept_id = 1;

UPDATE dept
SET Emp_id = 2
WHERE Dept_id = 2;

UPDATE dept
SET Emp_id = 3
WHERE Dept_id = 3;

UPDATE dept
SET Emp_id = 4
WHERE Dept_id = 4;

UPDATE dept
SET Emp_id = 5
WHERE Dept_id = 5;

select * from revature_emp;

select * from revature_emp where emp_name like "%n";

select * from revature_emp  order by emp_id desc;

select dept_name, count(*) from dept group by dept_name;

select * from revature_emp  order by emp_id desc limit 3;






