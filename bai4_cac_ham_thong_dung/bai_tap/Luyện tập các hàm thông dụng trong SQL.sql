CREATE DATABASE cac_ham_thong_dung;
CREATE TABLE danh_sach(
id INT,
ten VARCHAR(45),
tuoi int,
khoa_hoc varchar(45),
so_tien int
);
DROP TABLE danh_sach;
INSERT INTO danh_sach VALUES(1, 'hoang', 21, 'cntt', 400000);
INSERT INTO danh_sach VALUES(2, 'viet', 19, 'dtvt', 320000);
INSERT INTO danh_sach VALUES(3, 'thanh', 18, 'ktdn', 400000);
INSERT INTO danh_sach VALUES(4, 'nhan', 19, 'ck', 450000);
INSERT INTO danh_sach VALUES(5, 'huong', 20, 'tcnh', 500000);
INSERT INTO danh_sach VALUES(5, 'huong', 20, 'tcnh', 200000);
SELECT * FROM danh_sach;
SELECT * FROM danh_sach WHERE ten = 'huong';
SELECT SUM(so_tien) as 'tong so tien cua huong' FROM danh_sach
WHERE ten = 'huong';
SELECT DISTINCT ten FROM danh_sach;