package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entities.Sinhvien;

@Controller
@RequestMapping("/sinhvien")
public class SinhvienController {
	List<Sinhvien> list;
	int count = 6;
	
	public SinhvienController() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Sinhvien>();
		list.add(new Sinhvien(1, "Hoang", "Minh", 7.8d));
		list.add(new Sinhvien(2, "Lam", "Oanh", 8.5d));
		list.add(new Sinhvien(3, "Minh", "Ngoc", 7.0d));
		list.add(new Sinhvien(4, "Lan", "Phuong", 6.2d));
		list.add(new Sinhvien(5, "Hoang", "Bao", 5.6d));
	}
	
	@RequestMapping("/sinhvienform")
	public ModelAndView showForm() {
		return new ModelAndView("sinhvienform","command", new Sinhvien());
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("sinhvien") Sinhvien sv) {
		int id = count++;
		String fname = sv.getFname();
		String lname = sv.getLname();
		double diemtb = sv.getDiemtb();
		sv = new Sinhvien(id, fname, lname, diemtb);
		list.add(sv);
		return new ModelAndView("viewsinhvien", "list",list);
	}
	@RequestMapping("/viewsinhvien")
	public ModelAndView viewstudent() {
		return new ModelAndView("viewsinhvien","list",list);
	}
}
