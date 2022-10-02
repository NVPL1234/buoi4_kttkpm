package com.example.KTTKPMT4.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	
	@Id
	private int maMayBay;
	private String loai;
	private int tamBay;
	
	public int getMaMayBay() {
		return maMayBay;
	}
	public void setMaMayBay(int maMayBay) {
		this.maMayBay = maMayBay;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTamBay() {
		return tamBay;
	}
	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
	
	public MayBay() {
	}
	public MayBay(int maMayBay, String loai, int tamBay) {
		this.maMayBay = maMayBay;
		this.loai = loai;
		this.tamBay = tamBay;
	}
	
	@Override
	public String toString() {
		return "MayBay [maMayBay=" + maMayBay + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}
}