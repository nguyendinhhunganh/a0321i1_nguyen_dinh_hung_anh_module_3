DELIMITER //
CREATE PROCEDURE find_all_customers()
BEGIN
SELECT *FROM customers;
END //
DELIMITER ;
call find_all_customers();
DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//
CREATE PROCEDURE findAllCustomers()
BEGIN
   SELECT *  FROM customers where customerNumber = 175;
END; //

