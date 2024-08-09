use classicmodels;

CREATE TABLE employees_audit ( id INT AUTO_INCREMENT PRIMARY KEY, 
                               employeeNumber INT NOT NULL, 
                               lastname VARCHAR(50) NOT NULL, 
                               changedat DATETIME DEFAULT NULL, 
                               action VARCHAR(50) default null);
						
-- *************************************************************

UPDATE employees
SET lastName = 'khushi'
WHERE employeeNumber = 1056;

-- *********************************

select * from employees 
where employeeNumber = 1056;

-- ******************************************
-- create trigger now 

CREATE TRIGGER before_employee_update
       BEFORE UPDATE ON employees
	   FOR EACH ROW
  INSERT INTO employees_audit
  SET action = 'update',
         employeeNumber = OLD.employeeNumber,
		 lastname = OLD.lastname,
         
         changedat = NOW();
         
-- **************************************************
select * from employees_audit;

-- **************************************************
create trigger after_employee_insert
    after insert 
    on employees 
    for each row 
    insert into employees_audit
    set action='insert',
        employeeNumber=new.employeeNumber,
        lastname=new.lastname,
    changedat=now();
-- **********************************************
select * from employees;
insert into employees values(999,'Dasalkar','Vilas','x3452','vilasdasalkar@mail.com',2,1143,'sales rep');

-- *****************************************************
  select * from employees_audit;
  