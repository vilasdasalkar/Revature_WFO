use classicmodels;

-- 1)**********************************************************

DELIMITER $$

create PROCEDURE GetCustomers()
begin
   select customerName,
          city,
		  state,
          country
   from
         customers
   order by customerName;
end$$
DELIMITER ;

call GetCustomers();

--  2)*************************************************************


DELIMITER //

create PROCEDURE GetOfficeByCountry(in countryName varchar(225))
begin 
        select * from offices
        where country=countryName;
end //

DELIMITER ;

call GetOfficeByCountry('USA');

-- 3)***********************************************************************

DELIMITER $$
CREATE PROCEDURE GetOrderCountByStatus (IN orderStatus VARCHAR(25),
										OUT total INT)
BEGIN
        SELECT COUNT(orderNumber) INTO total
        FROM orders
        WHERE status = orderStatus;
        
END$$
DELIMITER ;

call GetOrderCountByStatus("shipped", @total);
select @total;

-- 4)*******************************************************
         
DELIMITER $$
    CREATE PROCEDURE SetCounter(inout counter int,
                                 in inc int)
begin 
     set counter =counter + inc;
end$$
DELIMITER ;

set @counter = 1;
call Setcounter(@counter,1);
call Setcounter(@counter,1);
call Setcounter(@counter,5);
select @counter;


