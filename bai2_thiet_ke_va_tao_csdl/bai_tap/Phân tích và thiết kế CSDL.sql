CREATE DATABASE phan_tich_thiet_ke_csdl;
CREATE TABLE customers(
customer_number INT(5) NOT NULL AUTO_INCREMENT,
customer_name VARCHAR(50) NOT NULL,
contact_last_name VARCHAR(50) NOT NULL,
contact_first_name VARCHAR(50) NOT NULL,
phone VARCHAR(50) NOT NULL,
address_line1 VARCHAR(50) NOT NULL,
address_line2 VARCHAR(50) NOT NULL,
city  VARCHAR(50) NOT NULL,
state VARCHAR(50) NOT NULL,
postal_code VARCHAR(15) NOT NULL,
country VARCHAR(50) NOT NULL,
credi_limit FLOAT,
PRIMARY KEY(customer_number)
);
DROP TABLE orders;
CREATE TABLE orders(
order_number INT(5) NOT NULL,
order_date DATE NOT NULL,
required_date DATE NOT NULL,
shiped_date DATE,
status_order VARCHAR(15) NOT NULL,
comments TEXT,
quantity_ordered INT NOT NULL,
price_each FLOAT NOT NULL,
PRIMARY KEY(order_number),
customer_number INT(5) NOT NULL AUTO_INCREMENT,
FOREIGN KEY(customer_number) REFERENCES customers(customer_number)
);
CREATE TABLE payments(
customer_number INT(5) NOT NULL AUTO_INCREMENT,
check_number VARCHAR(50) NOT NULL,
payment_date DATE NOT NULL,
amount FLOAT NOT NULL,
PRIMARY KEY(check_number),
FOREIGN KEY(customer_number) REFERENCES customers(customer_number)
);
CREATE TABLE products(
product_code VARCHAR(15) NOT NULL,
product_name VARCHAR(70) NOT NULL,
product_scale VARCHAR(10) NOT NULL,
product_vendor VARCHAR(50) NOT NULL,
product_description TEXT NOT NULL,
quantity_in_stock INT NOT NULL,
buy_price FLOAT NOT NULL,
msrp FLOAT NOT NULL,
PRIMARY KEY(product_code) 
);
CREATE TABLE order_product(
order_number INT(5) NOT NULL,
product_code VARCHAR(15) NOT NULL,
PRIMARY KEY(order_number, product_code),
FOREIGN KEY(order_number) REFERENCES orders(order_number),
FOREIGN KEY(product_code) REFERENCES products(product_code)
);
CREATE TABLE product_lines(
product_line VARCHAR(50) NOT NULL,
text_description TEXT,
image VARCHAR(50),
PRIMARY KEY(product_line)
);
ALTER TABLE products ADD COLUMN product_line VARCHAR(50) NOT NULL;
ALTER TABLE products ADD FOREIGN KEY(product_line) REFERENCES product_lines(product_line);
CREATE TABLE employees(
employee_number INT NOT NULL,
last_name VARCHAR(50) NOT NULL,
first_name VARCHAR(50) not NULL,
email VARCHAR(100) NOT NULL,
job_title VARCHAR(50) NOT NULL,
PRIMARY KEY(employee_number),
report_to INT NOT NULL,
FOREIGN KEY(report_to) REFERENCES employees(employee_number)
);
CREATE TABLE offices(
office_code VARCHAR(10) NOT NULL,
 city  VARCHAR(50) NOT NULL,
 phone VARCHAR(50) NOT NULL,
 address_line1 VARCHAR(50) NOT NULL,
address_line2 VARCHAR(50) NOT NULL,
country  VARCHAR(50) NOT NULL,
state VARCHAR(50) NOT NULL,
postal_code VARCHAR(15) NOT NULL,
PRIMARY KEY(office_code)
);
ALTER TABLE customers ADD COLUMN sales_rep_employee_number INT NOT NULL;
ALTER TABLE customers ADD FOREIGN KEY(sales_rep_employee_number) REFERENCES employees(employee_number);
ALTER TABLE employees add COLUMN office_code VARCHAR(10) NOT NULL;
ALTER TABLE employees ADD FOREIGN KEY(office_code) REFERENCES offices(office_code);   