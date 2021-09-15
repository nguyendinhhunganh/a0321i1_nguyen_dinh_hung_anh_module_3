CREATE DATABASE tao_khoa_chinh;
CREATE TABLE users(
   user_id INT AUTO_INCREMENT,
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255),
   PRIMARY KEY(user_id)
);
drop table users;
CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id)
);
ALTER TABLE table_name
    ADD PRIMARY KEY(primary_key_column);