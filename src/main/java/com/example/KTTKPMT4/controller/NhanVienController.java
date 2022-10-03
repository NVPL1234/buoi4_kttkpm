package com.example.KTTKPMT4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTTKPMT4.entity.NhanVien;
import com.example.KTTKPMT4.service.NhanVienService;

@RestController
@RequestMapping("/nhanVien")
public class NhanVienController {

	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/getLuongNhoHon10000")
	public List<NhanVien> getLuongNhoHon10000() {
		return nhanVienService.getLuongNhoHon10000();
	}
	
	@GetMapping("/tongLuong")
	public double tongLuong() {
		return nhanVienService.tongLuong();
	}
	
	@GetMapping("/getPhiCongBoeing")
	public List<String> getPhiCongBoeing(){
		return nhanVienService.getPhiCongBoeing();
	}
	
	@GetMapping("/getNhanVienLaiMB747")
	public List<String> getNhanVienLaiMB747(){
		return nhanVienService.getNhanVienLaiMB747();
	}
	
	@GetMapping("/getMBNVHoNguyenLaiDuoc")
	public List<Integer> getMBNVHoNguyenLaiDuoc(){
		return nhanVienService.getMBNVHoNguyenLaiDuoc();
	}
	
	@GetMapping("/getPhiCongLaiMBBoeing")
	public List<String> getPhiCongLaiMBBoeing(){
		return nhanVienService.getPhiCongLaiMBBoeing();
	}
}
