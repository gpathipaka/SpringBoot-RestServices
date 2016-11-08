package com.ganga.service;

import java.util.Collection;

import com.ganga.domain.Employee;

public interface EmployeeService {

	public Collection<Employee> getAllEmployees();

	public Employee getEmployee(int id);
	
	public Employee deleteEmployee(int id);
	
	public void updateEmployee(Employee employee);
	
	public Employee createEmployee(Employee employee);
}
