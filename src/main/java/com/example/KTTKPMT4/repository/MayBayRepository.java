package com.example.KTTKPMT4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.KTTKPMT4.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	
	@Query(value = "SELECT * FROM [maybay] where tam_bay > 10000", nativeQuery = true)
	public List<MayBay> getTamBayLonHon10000();
	
	@Query(value = "select * from maybay where loai LIKE 'Boeing%'", nativeQuery = true)
	public List<MayBay> getMayBayBoeing();
	
	@Query(value = "select * from maybay where tam_bay > (select do_dai from chuyenbay where macb LIKE 'VN280%')", nativeQuery = true)
	public List<MayBay> getMBBayCBVN280();
	
	@Query(value = "select cn.ma_may_bay, mb.loai, count(cn.ma_nhan_vien) as tong_nhan_vien from chungnhan cn join maybay mb on cn.ma_may_bay = mb.ma_may_bay group by cn.ma_may_bay, mb.loai", nativeQuery = true)
	public List<Object> getTongNVMoiLoaiMB();
}
