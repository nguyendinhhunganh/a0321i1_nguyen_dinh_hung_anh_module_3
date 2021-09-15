CREATE DATABASE xac_dinh_khoa;
CREATE TABLE customers(
id INT(15) NOT NULL AUTO_INCREMENT,
customer_name VARCHAR(50) NOT NULL,
email VARCHAR(20) NOT NULL,
telephone INT(12),
PRIMARY KEY(id)
);
CREATE TABLE accounts(
stk INT(15) NOT NULL,
kieu_tai_khoan VARCHAR(10),
ngay_mo DATE,
so_du INT(20) NOT NULL,
PRIMARY KEY(stk),
customer_id INT(15) NOT NULL Auto_increment,
FOREIGN KEY(customer_id) REFERENCES customers(id)
);
CREATE TABLE transactions(
ma_giao_dich INT(15) NOT NULL,
so_tien INT(20) NOT NULL,
thoi_gian DATE,
mo_ta TEXT,
PRIMARY KEY(ma_giao_dich),
account_stk INT(15) NOT NULL,
FOREIGN KEY(account_stk) REFERENCES accounts(stk)
);

 