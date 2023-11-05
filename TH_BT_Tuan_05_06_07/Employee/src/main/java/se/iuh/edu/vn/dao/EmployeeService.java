package se.iuh.edu.vn.dao;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Session;
=======
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
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
<<<<<<< HEAD
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.deleteEmployee(id);
		
	}
	@Transactional
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		dao.saveEmployee(emp);
		
	}
	@Transactional
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		dao.updateEmployee(emp);
		
	}
	@Transactional
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
=======
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
}
