package com.se.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se.springdemo.dao.CustomerDAO;
import com.se.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	// need to inject customer dao
	private final CustomerDAO customerDAO;

	@Autowired
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		System.out.println("aaaaa");
		customerDAO.deleteCustomer(theId);;
	}

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}
}