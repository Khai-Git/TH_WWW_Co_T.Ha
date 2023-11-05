package se.iuh.edu.vn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import se.iuh.edu.vn.beans.Employee;
import se.iuh.edu.vn.dao.EmployeeDAO;
import se.iuh.edu.vn.dao.EmployeeService;

@Controller
//@RequestMapping("/emp")
public class EmployeeController {	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/")
	@GetMapping("/viewemp")
	public String viewemp(Model model) {
		List<Employee> list = service.getList();
		model.addAttribute("list", list);
		return "viewemp";
	}
	
	@PostMapping("/save")
	public String save(HttpServletRequest http) {
		Employee empl = new Employee();
		String name = http.getParameter("name");
		String salary = http.getParameter("salary");
		String des = http.getParameter("des");
		empl.setName(name);
		empl.setSalary(Integer.valueOf(salary));
		empl.setDesignation(des);
		service.save(empl);

		return "redirect:/";
	}

	@GetMapping("/update")
	public String edit(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("salary") int salary, @RequestParam("des") String des) {
		Employee empl = new Employee();
		empl.setId(id);
		empl.setName(name);
		empl.setSalary(salary);
		empl.setDesignation(des);

		System.out.println(empl);
		service.update(empl);

		return "redirect:/";
	}

	@GetMapping(value = "/empform")
	public String add() {
		return "empform";
	}

	@GetMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model model) {

		Employee emp = service.getById(id);
		model.addAttribute("editEmp", emp);
		return "empeditform";
	}

	@GetMapping(value = "/deleteemp/{id}")
	public ModelAndView delete(@PathVariable int id) {
		service.delete(id);
		return new ModelAndView("redirect:/");
	}
}