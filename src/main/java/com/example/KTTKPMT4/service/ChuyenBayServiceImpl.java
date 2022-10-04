package com.example.KTTKPMT4.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTTKPMT4.entity.ChuyenBay;
import com.example.KTTKPMT4.repository.ChuyenBayRepository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> chuyenBayDenDaLat() {
		return chuyenBayRepository.chuyenBayDenDaLat();
	}

	@Override
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000() {
		return chuyenBayRepository.getDoDaiLonHon8000NhoHon10000();
	}

	@Override
	public List<ChuyenBay> getDiSGNDenBMV() {
		return chuyenBayRepository.getDiSGNDenBMV();
	}

	@Override
	public List<ChuyenBay> getDiSGN() {
		return chuyenBayRepository.getDiSGN();
	}

	@Override
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc() {
		return chuyenBayRepository.getCBMBAirbusA320BayDuoc();
	}

	@Override
	public int getTongChuyenBayCuaGaDi(String gaDi) {
		return chuyenBayRepository.getTongChuyenBayCuaGaDi(gaDi);
	}

	@Override
	public double getTongChiPhiCuaCBOGaDi(String gaDi) {
		return chuyenBayRepository.getTongChiPhiCuaCBOGaDi(gaDi);
	}

	@Override
	public List<ChuyenBay> getCBDiTruoc12h() {
		return chuyenBayRepository.getCBDiTruoc12h();
	}

	@Override
	public int getTongCBDiTruoc12hO(String gaDi) {
		return chuyenBayRepository.getTongCBDiTruoc12hO(gaDi);
	}
}