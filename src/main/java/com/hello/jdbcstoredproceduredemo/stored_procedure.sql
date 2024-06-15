DELIMITER $$

DROP PROCEDURE IF EXISTS `bankdb`.`getRecord` $$
CREATE PROCEDURE `bankdb`.`getRecord` (
IN in_id INTEGER,
OUT out_first_name VARCHAR(100),
OUT out_last_name VARCHAR(100),
OUT out_email  VARCHAR(100))
BEGIN
   SELECT first_name, last_name, email
   INTO out_first_name, out_last_name, out_email
   FROM users where id = in_id;
END $$

DELIMITER ;