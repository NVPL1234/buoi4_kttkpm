package com.example.KTTKPMT4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTTKPMT4.entity.NhanVien;
import com.example.KTTKPMT4.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService{

	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Override
	public List<NhanVien> getLuongNhoHon10000() {
		return nhanVienRepository.getLuongNhoHon10000();
	}

	@Override
	public double tongLuong() {
		return nhanVienRepository.tongLuong();
	}

	@Override
	public List<String> getPhiCongBoeing() {
		return nhanVienRepository.getPhiCongBoeing();
	}

	@Override
	public List<String> getNhanVienLaiMB747() {
		return nhanVienRepository.getNhanVienLaiMB747();
	}

	@Override
	public List<Integer> getMBNVHoNguyenLaiDuoc() {
		return nhanVienRepository.getMBNVHoNguyenLaiDuoc();
	}

	@Override
	public List<String> getPhiCongLaiMBBoeing() {
		return nhanVienRepository.getPhiCongLaiMBBoeing();
	}

}
