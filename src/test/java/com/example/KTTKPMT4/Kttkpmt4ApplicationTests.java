package com.example.KTTKPMT4;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.KTTKPMT4.entity.ChuyenBay;
import com.example.KTTKPMT4.entity.MayBay;
import com.example.KTTKPMT4.repository.ChuyenBayRepository;
import com.example.KTTKPMT4.repository.MayBayRepository;

@SpringBootTest
class Kttkpmt4ApplicationTests {

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Autowired
	private MayBayRepository mayBayRepository;

	@Test
	public void cau1() {
		List<ChuyenBay> result = chuyenBayRepository.chuyenBayDenDaLat();
		System.out.println("Các chuyến bay đi Đà Lạt: " + result);
	}

	@Test
	public void cau2() {
		List<MayBay> result = mayBayRepository.getTamBayLonHon10000();
		System.out.println("Các loại máy bay có tầm bay lớn hơn 10,000km: " + result);
	}
	
	
}
