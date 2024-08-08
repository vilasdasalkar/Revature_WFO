use classicmodels;
-- -------------------------------------------

select contactFirstName , contactLastName
from customers
order by contactFirstName asc;

-- 1st command ---------------------------------

select contactFirstName , contactLastName
from customers
order by contactLastName desc, contactFirstName asc;

-- 2nd command ---------------------------------

select * from customers 
where country="USA";

-- 3rd ------------------------------------------

select * from customers 
where city like 'A%';

-- 4th ------------------------------------------

select * from customers 
where city like 'A%' and customerNumber between 112 and 200 ;

-- 5th ------------------------------------------

-- employee table query

select lastName,firstName,jobTitle
from employees 
where jobtitle='sales rep';

-- ---------------------------------------
select lastName,firstName,jobTitle,officeCode
from employees 
where jobtitle='sales rep' and officeCode=1;

-- ------------------------------------------

select distinct officeCode 
from employees 
order by officeCode;

-- -------------------------

select * from offices
where country in ('USA' , 'france');

-- ------------------------------
select * from offices
order by officeCode desc limit 5;

-- -------------------------------
select * from offices
order by officeCode limit 5;
