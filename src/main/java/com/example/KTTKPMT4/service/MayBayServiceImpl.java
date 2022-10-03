package com.example.KTTKPMT4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KTTKPMT4.entity.MayBay;
import com.example.KTTKPMT4.repository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService{
	
	@Autowired
	private MayBayRepository mayBayRepository;

	@Override
	public List<MayBay> getTamBayLonHon10000() {
		return mayBayRepository.getTamBayLonHon10000();
	}

	@Override
	public List<MayBay> getMayBayBoeing() {
		return mayBayRepository.getMayBayBoeing();
	}

	@Override
	public List<MayBay> getMBBayCBVN280() {
		return mayBayRepository.getMBBayCBVN280();
	}
	
	
}