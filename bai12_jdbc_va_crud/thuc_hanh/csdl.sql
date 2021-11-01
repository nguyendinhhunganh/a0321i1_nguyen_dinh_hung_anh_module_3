CREATE DATABASE demo;
USE demo;
create table users (
 id  int NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
insert into users(id, name, email, country) values(1,'Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
select * from users having country like "viet nam";
select * from users order by name;

DELIMITER //
CREATE PROCEDURE find_all()
BEGIN
select * from users;
END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE update_user(
IN user_id int,
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
update users set name = user_name, email = user_email, country = user_country where id = user_id;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE delete_user(
IN user_id int
)
BEGIN
delete from users where id = user_id;
END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE get_user_by_id(IN user_id INT)
BEGIN
    SELECT users.name, users.email, users.country
    FROM users
    where users.id = user_id;
END //
DELIMITER ;


DELIMITER //
CREATE PROCEDURE insert_user(
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);
    END //
DELIMITER ;

create table Permision(
id int primary key,
name varchar(50)
);

drop table Permision;
 
create table User_Permision(
permision_id int,
user_id int
);

drop table User_Permision;

insert into Permision values(1,'add');

insert into Permision values(2,'edit');

insert into Permision values(3,'delete');

insert into Permision values(4,'view');