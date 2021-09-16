CREATE DATABASE quan_ly_thu_vien;
CREATE TABLE address(
id_address INT NOT NULL AUTO_INCREMENT,
province VARCHAR(50) DEFAULT NULL,
district VARCHAR(50) DEFAULT NULL,
ward VARCHAR(50) DEFAULT NULL,
PRIMARY KEY(id_address)
);
CREATE TABLE students(
student_number INT NOT NULL,
name_student VARCHAR(50) NOT NULL,
id_address INT NOT NULL AUTO_INCREMENT,
FOREIGN KEY(id_address) REFERENCES address(id_address),
email VARCHAR(50),
image BLOB, 
PRIMARY KEY(student_number)
);
CREATE TABLE books(
book_id INT NOT NULL,
book_name VARCHAR(50) NOT NULL,
writer VARCHAR(50) DEFAULT NULL,
release_time DATE,
price FLOAT DEFAULT NULL,
PRIMARY KEY(book_id),
category_number int not null,
FOREIGN KEY(category_number) REFERENCES category(category_number)
);
CREATE table category(
category_number int NOT NULL,
book_type VARCHAR(50) DEFAULT NULL,
PRIMARY KEY(category_number) 
);
CREATE TABLE borrow_order(
borrow_id INT NOT NULL,
borrow_time DATE NOT NULL,
return_time DATE NOT NULL,
quantity_book INT NOT NULL,
PRIMARY KEY(borrow_id),
student_number int not null,
FOREIGN KEY(student_number) REFERENCES students(student_number)
);
CREATE TABLE books_borrow_order(
borrow_id int not null,
book_id int not null,
PRIMARY KEY(borrow_id, book_id),
FOREIGN KEY(borrow_id) REFERENCES borrow_order(borrow_id),
FOREIGN KEY(book_id) REFERENCES books(book_id)
);