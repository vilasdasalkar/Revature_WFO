DELIMITER $$
CREATE FUNCTION CustomerLevel( credit DECIMAL(10,2) )
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
DECLARE customerLevel VARCHAR(20);
IF credit > 50000 THEN 
  SET customerLevel = 'PLATINUM'; 
  ELSEIF (credit >= 50000 AND credit <= 10000) THEN 
  SET customerLevel = 'GOLD'; 
  ELSEIF credit < 10000 THEN 
  SET customerLevel = 'SILVER'; 
END IF;
 RETURN (customerLevel);

END$$
DELIMITER ;

-- *******************************************
SELECT  customerName,
        CustomerLevel (creditLimit)
FROM customers
ORDER BY customerName;