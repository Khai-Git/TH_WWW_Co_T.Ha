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
	
	public void saveEmployee(Employee employee, int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
		
	}
	
	public void updateEmployee(Employee employee, int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
	}
	
	public void deleteEmployee(int idEmp) {
		Session currentSession = sessionFactory.getCurrentSession();
	}
}