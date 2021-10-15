-- YC 2
SELECT * FROM nhan_vien WHERE ho_ten LIKE '%h' OR ho_ten LIKE '%t' OR ho_ten LIKE '%k' AND length(ho_ten) <= 15;
-- YC 3
select * from khach_hang where (51*30*365) > (curdate()-ngay_sinh) and (curdate()-ngay_sinh) >(18*30*365) and (diachi like '%da nang%' or diachi like '%Quang tri%');  
-- YC 4
SELECT khach_hang.ho_ten, count(hop_dong.id_hop_dong) as 'so lan dat phong' FROM khach_hang INNER JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
INNER JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach WHERE loai_khach.ten_loai_khach = 'Diamond'
GROUP BY khach_hang.id_khach_hang ORDER BY 'so lan dat phong';
-- YC 5
SELECT khach_hang.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.id_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
sum(dich_vu.chi_phi_thue + dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong) AS tong_tien FROM khach_hang 
LEFT JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
LEFT JOIN loai_khach ON khach_hang.id_loai_khach = loai_khach.id_loai_khach
LEFT JOIN dich_vu on hop_dong.id_dich_vu = dich_vu.id_dich_vu
LEFT JOIN hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
LEFT JOIN dich_vu_di_kem ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
GROUP BY hop_dong.id_hop_dong;
-- YC 6
SELECT dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dv FROM dich_vu
INNER JOIN loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
