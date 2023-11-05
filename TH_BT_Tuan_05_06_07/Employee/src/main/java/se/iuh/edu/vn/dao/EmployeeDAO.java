package se.iuh.edu.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se.iuh.edu.vn.beans.Employee;

@Repository
public class EmployeeDAO {
	private final SessionFactory sessionFactory;

	@Autowired
	public EmployeeDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public List<Employee> getEmployees() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> employee = theQuery.getResultList();
		return employee;
	}
	
<<<<<<< HEAD
	public void saveEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(employee);
		
	}
	public Employee getById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Employee.class, id);
		
	}
	
	public void updateEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();
		 // Tìm đối tượng Employee cần cập nhật dựa trên ID
	    Employee existingEmployee = currentSession.get(Employee.class, employee.getId());
	    
	    if (existingEmployee != null) {
	        // Cập nhật thông tin của đối tượng Employee
	        existingEmployee.setName(employee.getName());
	        existingEmployee.setSalary(employee.getSalary());
	        existingEmployee.setDesignation(employee.getDesignation());
	        
	        // Lưu cập nhật vào cơ sở dữ liệu
	        currentSession.update(existingEmployee);
	    }
=======
	public void saveEmployee(Employee employee, int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
		
	}
	
	public void updateEmployee(Employee employee, int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
	}
	
	public void deleteEmployee(int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
<<<<<<< HEAD
		Employee employeeToDelete = currentSession.get(Employee.class, idEmp);
		currentSession.delete(employeeToDelete);
=======
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
	}
}