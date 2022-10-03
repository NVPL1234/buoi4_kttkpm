package com.example.KTTKPMT4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.KTTKPMT4.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{

	@Query(value = "select * from nhanvien where luong<10000", nativeQuery = true)
	public List<NhanVien> getLuongNhoHon10000();
	
	@Query(value = "select sum(luong) as tong_luong from nhanvien", nativeQuery = true)
	public double tongLuong();
	
	@Query(value = "select cn.ma_nhan_vien from chungnhan cn join maybay mb on cn.ma_may_bay = mb.ma_may_bay where loai LIKE 'Boeing%'", nativeQuery = true)
	public List<String> getPhiCongBoeing();
	
	@Query(value = "select ma_nhan_vien from chungnhan where ma_may_bay=747", nativeQuery = true)
	public List<String> getNhanVienLaiMB747();
	
	@Query(value = "select cn.ma_may_bay from chungnhan cn join nhanvien nv on cn.ma_nhan_vien = nv.ma_nhan_vien where ten LIKE 'Nguyen%'", nativeQuery = true)
	public List<Integer> getMBNVHoNguyenLaiDuoc();
	
	@Query(value = "select nv.ten from chungnhan cn join nhanvien nv on cn.ma_nhan_vien = nv.ma_nhan_vien join maybay mb on cn.ma_may_bay = mb.ma_may_bay where mb.loai LIKE 'Boeing%'", nativeQuery = true)
	public List<String> getPhiCongLaiMBBoeing();
}
