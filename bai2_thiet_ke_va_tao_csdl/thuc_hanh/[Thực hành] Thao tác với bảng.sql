CREATE DATABASE thao_tac_voi_bang;
CREATE TABLE contacts(
contact_id INT(11)  NOT NULL AUTO_INCREMENT,
last_name VARCHAR(30) NOT NULL,
first_name VARCHAR(25),
birthday DATE,
PRIMARY KEY(contact_id)
);
DROP TABLE contacts;
ALTER TABLE contacts
ADD email VARCHAR(30) NOT NULL
AFTER contact_id;
ALTER TABLE contacts
drop column first_name;
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name;
    ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL
  after first_name,
  MODIFY email VARCHAR(50) AFTER birthday;
    ALTER TABLE contacts
    CHANGE COLUMN email emails
    VARCHAR(30) null;
ALTER TABLE contacts
RENAME to contact;