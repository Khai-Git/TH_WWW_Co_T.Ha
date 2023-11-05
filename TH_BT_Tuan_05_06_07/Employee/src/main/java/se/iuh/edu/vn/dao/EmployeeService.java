package se.iuh.edu.vn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.iuh.edu.vn.beans.Employee;

@Service
public class EmployeeService {
	private final EmployeeDAO dao;

	@Autowired
	public EmployeeService(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@Transactional
	public List<Employee> getList() {
		return dao.getEmployees();
	}
}
