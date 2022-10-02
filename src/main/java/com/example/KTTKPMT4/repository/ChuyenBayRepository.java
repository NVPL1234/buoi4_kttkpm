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
	
}
