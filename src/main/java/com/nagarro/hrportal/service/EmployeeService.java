package com.nagarro.hrportal.service;

import java.util.List;
import com.nagarro.hrportal.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(long id);
	
	public List<Employee> getEmployeeByEmpId(String empId);

	public Employee getEmployeeByEmail(String email);

	public void saveOrUpdateEmployee(Employee employee);

	public void deleteEmployee(long id);

	public Employee checkLogin(String email, String password);
	
	public List<Employee> search(String keyword);
	
	public String getEmployeePassword(String email);
	
	public void deleteAllEmployee();

}

