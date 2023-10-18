package com.demo.entities;

public class Sinhvien {
	private Integer Id;
	private String fname;
	private String lname;
	private double diemtb;
	public Sinhvien() {
		super();
	}
	public Sinhvien(Integer id, String fname, String lname, double diemtb) {
		super();
		Id = id;
		this.fname = fname;
		this.lname = lname;
		this.diemtb = diemtb;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(double diemtb) {
		this.diemtb = diemtb;
	}
	@Override
	public String toString() {
		return "Sinhvien [Id=" + Id + ", fname=" + fname + ", lname=" + lname + ", diemtb=" + diemtb + "]";
	}
	
	
}
