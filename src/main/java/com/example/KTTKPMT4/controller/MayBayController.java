package com.example.KTTKPMT4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KTTKPMT4.entity.MayBay;
import com.example.KTTKPMT4.service.MayBayService;

@RestController
@RequestMapping("/mayBay")
public class MayBayController {
	
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/getTamBayLonHon10000")
	public List<MayBay> getTamBayLonHon10000() {
		return mayBayService.getTamBayLonHon10000();
	}
	
	@GetMapping("/getMayBayBoeing")
	public List<MayBay> getMayBayBoeing() {
		return mayBayService.getMayBayBoeing();
	}
	
	@GetMapping("/getMBBayCBVN280")
	public List<MayBay> getMBBayCBVN280(){
		return mayBayService.getMBBayCBVN280();
	}
	
	@GetMapping("/getTongNVMoiLoaiMB")
	public List<Object> getTongNVMoiLoaiMB(){
		return mayBayService.getTongNVMoiLoaiMB();
	}
}
