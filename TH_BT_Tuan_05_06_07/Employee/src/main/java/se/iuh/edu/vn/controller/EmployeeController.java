package se.iuh.edu.vn.controller;

import java.util.List;

<<<<<<< HEAD
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
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
import org.springframework.web.servlet.ModelAndView;

import se.iuh.edu.vn.beans.Employee;
import se.iuh.edu.vn.dao.EmployeeDAO;
import se.iuh.edu.vn.dao.EmployeeService;

@Controller
<<<<<<< HEAD
@RequestMapping("/emp")
=======
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
public class EmployeeController {
	@Autowired
	EmployeeService service;

//	@RequestMapping("/empform")
//	public ModelAndView showform() {
<<<<<<< HEAD
//		return new ModelAndView("empform", "command", new EmployeeService(null));
//	}
//
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

		return "redirect:/emp/viewemp";
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

		return "redirect:/emp/viewemp";
	}

	@GetMapping(value = "/empform")
	public String add() {
		return "empform";
	}

//	
	@GetMapping("/viewemp")
=======
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
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
	public String viewemp(Model model) {
		List<Employee> list = service.getList();
		model.addAttribute("list", list);
//		return new ModelAndView("list", "viewemp", list);
		return "viewemp";
	}

<<<<<<< HEAD
	@GetMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model model) {

		Employee emp = service.getById(id);
		model.addAttribute("editEmp", emp);
		return "empeditform";
	}

=======
//	@RequestMapping(value = "/editemp/{id}")
//	public ModelAndView edit(@PathVariable int id) {
//		Employee emp = dao.getEmpById(id);
//		return new ModelAndView("empeditform", "command", emp);
//	}
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
//
//	/* Cập nhật đối tượng model. */
//	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
//	public ModelAndView editsave(@ModelAttribute("emp") Employee emp) {
//		dao.update(emp);
//		return new ModelAndView("redirect:/viewemp");
//	}
//
<<<<<<< HEAD
	@GetMapping(value = "/deleteemp/{id}")
	public ModelAndView delete(@PathVariable int id) {
		service.delete(id);
		return new ModelAndView("redirect:/emp/viewemp");
	}
=======
//	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
//	public ModelAndView delete(@PathVariable int id) {
//		dao.delete(id);
//		return new ModelAndView("redirect:/viewemp");
//	}
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
}