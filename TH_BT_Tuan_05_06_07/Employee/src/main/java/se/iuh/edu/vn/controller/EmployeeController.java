package se.iuh.edu.vn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import se.iuh.edu.vn.beans.Employee;

@Controller
public class EmployeeController {
	@Autowired
	Employee dao;
	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform", "command", new Employee());
	}
}