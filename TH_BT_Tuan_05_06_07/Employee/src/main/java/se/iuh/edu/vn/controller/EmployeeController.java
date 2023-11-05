package se.iuh.edu.vn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import se.iuh.edu.vn.beans.Employee;
import se.iuh.edu.vn.dao.EmployeeDAO;
import se.iuh.edu.vn.dao.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;

//	@RequestMapping("/empform")
//	public ModelAndView showform() {
//		return new ModelAndView("empform", "command", new EmployeeDAO());
//	}
//
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
//		dao.save(emp);
//		return new ModelAndView("redirect:/viewemp");
//	}
//	
	@RequestMapping("/viewemp")
	public String viewemp(Model model) {
		List<Employee> list = service.getList();
		model.addAttribute("list", list);
//		return new ModelAndView("list", "viewemp", list);
		return "viewemp";
	}

//	@RequestMapping(value = "/editemp/{id}")
//	public ModelAndView edit(@PathVariable int id) {
//		Employee emp = dao.getEmpById(id);
//		return new ModelAndView("empeditform", "command", emp);
//	}
//
//	/* Cập nhật đối tượng model. */
//	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
//	public ModelAndView editsave(@ModelAttribute("emp") Employee emp) {
//		dao.update(emp);
//		return new ModelAndView("redirect:/viewemp");
//	}
//
//	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
//	public ModelAndView delete(@PathVariable int id) {
//		dao.delete(id);
//		return new ModelAndView("redirect:/viewemp");
//	}
}