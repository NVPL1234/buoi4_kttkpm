package com.example.KTTKPMT4.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.KTTKPMT4.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
	
	@Query(value = "SELECT * FROM chuyenbay WHERE ga_den = 'DAD'",
		   nativeQuery = true
	)
	public List<ChuyenBay> chuyenBayDenDaLat();
	
	@Query(value = "select * from chuyenbay where do_dai<10000 and do_dai>8000", nativeQuery = true)
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000();
	
	@Query(value = "select * from chuyenbay where ga_di='SGN' and ga_den='BMV'", nativeQuery = true)
	public List<ChuyenBay> getDiSGNDenBMV();
	
	@Query(value = "select * from chuyenbay where ga_di='SGN'", nativeQuery = true)
	public List<ChuyenBay> getDiSGN();
	
	@Query(value = "select * from chuyenbay where do_dai < (select tam_bay from maybay where loai LIKE 'Airbus A320%')", nativeQuery = true)
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc();
}
