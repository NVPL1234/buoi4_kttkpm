package com.example.KTTKPMT4.service;

import java.util.List;

import com.example.KTTKPMT4.entity.NhanVien;

public interface NhanVienService {
	
	public List<NhanVien> getLuongNhoHon10000();
	public double tongLuong();
	public List<String> getPhiCongBoeing();
	public List<String> getNhanVienLaiMB747();
	public List<Integer> getMBNVHoNguyenLaiDuoc();
	public List<String> getPhiCongLaiMBBoeing();
}
