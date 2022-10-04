package com.example.KTTKPMT4.service;

import java.util.List;

import com.example.KTTKPMT4.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> chuyenBayDenDaLat();
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000();
	public List<ChuyenBay> getDiSGNDenBMV();
	public List<ChuyenBay> getDiSGN();
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc();
	public int getTongChuyenBayCuaGaDi(String gaDi);
	public double getTongChiPhiCuaCBOGaDi(String gaDi);
	public List<ChuyenBay> getCBDiTruoc12h();
	public int getTongCBDiTruoc12hO(String gaDi);
}
