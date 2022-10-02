package com.example.KTTKPMT4.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maNhanVien")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maMayBay")
	private MayBay mayBay;
	
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public MayBay getMayBay() {
		return mayBay;
	}
	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}
	
	public ChungNhan() {
	}
	public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}
	
	@Override
	public String toString() {
		return "ChungNhan [nhanVien=" + nhanVien + ", mayBay=" + mayBay + "]";
	}	
}