package fit.iuh;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import model.SinhVien;

public class SinhVienController {
	
	List<SinhVien> svList;
	int count =6;
	
	public SinhVienController() {
		// TODO Auto-generated constructor stub
		SinhVien sv1 = new SinhVien(1, "", "", 8);
		SinhVien sv2 = new SinhVien(1, "", "", 8);
		SinhVien sv3 = new SinhVien(1, "", "", 8);
		SinhVien sv4 = new SinhVien(1, "", "", 8);
		SinhVien sv5 = new SinhVien(1, "", "", 8);
		svList.add(sv1);
		svList.add(sv2);
		svList.add(sv3);
		svList.add(sv4);
		svList.add(sv5);
	}
	
	public ModelAndView showForm() {
		return new ModelAndView("sinhvienform","command", new SinhVien());
	}
	
	public ModelAndView save(@ModelAttribute("sinhvien") SinhVien sv) {
		
		int id = count++;
		String fname = sv.getfName();
		String lname = sv.getlName();
		Double diem = sv.getDiemtb();
		sv = new SinhVien(id, fname, lname, diem);
		svList.add(sv);
		return new ModelAndView("viewsinhvien", "list",svList);
	}
	
	public ModelAndView viewStudent() {
		return new ModelAndView("viewsinhvien","list",svList);
	}
}
