CREATE DATABASE demo;
CREATE TABLE products(
id int not null,
product_code varchar(20) not null,
product_name varchar(50),
product_price float,
product_amount int,
product_description text,
product_status text,
primary key (id)
);
insert into products values (1,'PD11','điện thoại1', 3000000, 7, '', '');
insert into products values (2,'PD12','điện thoại2', 3000000, 4, '', '');
insert into products values (3,'PD13','điện thoại3', 3000000, 9, '', '');
insert into products values (4,'PD14','điện thoại4', 3000000, 6, '', '');
------
ALTER TABLE products ADD INDEX idx_product(product_code);
CREATE UNIQUE INDEX index_product ON products(product_code);
EXPLAIN SELECT * FROM products WHERE product_code = 'PD11';
ALTER TABLE products DROP INDEX idx_product;
CREATE INDEX idx_name_price ON products(product_name, product_price);
EXPLAIN SELECT * FROM products WHERE product_name = 'điện thoại2';
-------
CREATE VIEW product_view AS
SELECT products.product_code, products.product_name, products.product_price, products.product_status FROM products;
SELECT * FROM product_view;
CREATE OR REPLACE VIEW product_view as
SELECT products.product_code, products.product_name, products.product_price FROM products;
DROP VIEW product_view;
------
delimiter //
CREATE PROCEDURE find_all_inf()
begin 
SELECT * from products;
END //
delimiter ;
CALL find_all_inf();

delimiter //
CREATE PROCEDURE add_new(
in id int ,
in product_code varchar(20),
in product_name varchar(50),
in product_price float,
in product_amount int,
in product_description text,
in product_status text)
begin 
INSERT INTO products VALUES(id,product_code,product_name,product_price,product_amount,product_description,product_status);
END //
delimiter ;
CALL add_new(5,'PD123','tai nghe', 300000, 10, 'av', 'ad');

delimiter //
CREATE PROCEDURE edit_product(in id int,
in product_code varchar(20),
in product_name varchar(50),
in product_price float,
in product_amount int,
in product_description text,
in product_status text)
BEGIN
UPDATE products
SET products.id = id,
products.product_code = product_code,
products.product_name = product_name,
products.product_price = product_price,
products.product_amount = product_amount,
products.product_description = product_description,
products.product_status = product_status
where products.id = id;
end // 
delimiter ;
CALL edit_product(5,'PD122','tai phone', 20000, 10, 'v', 'ad');

	delimiter //
CREATE PROCEDURE delete_product(IN id INT)
BEGIN 
DELETE FROM products WHERE products.id = id;
end //
delimiter ;  
call delete_product(3);