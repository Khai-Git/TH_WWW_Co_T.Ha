package model;

public class SinhVien {
	
	private int id;
	private String fName;
	private String lName;
	private double diemtb;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(int id, String fName, String lName, double diemtb) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.diemtb = diemtb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getDiemtb() {
		return diemtb;
	}

	public void setDiemtb(double diemtb) {
		this.diemtb = diemtb;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", fName=" + fName + ", lName=" + lName + ", diemtb=" + diemtb + "]";
	}
	
	
	
	
	

}
