package com.ganga.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ganga.dao.EmployeeDao;
import com.ganga.domain.Employee;

@Service
@Qualifier("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Collection<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}

	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}

	public Employee deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	public Employee createEmployee(Employee employee) {
		return employeeDao.createEmployee(employee);
	}

}
