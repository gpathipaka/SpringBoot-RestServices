package com.ganga.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ganga.domain.Employee;

@Repository
public class EmployeeDao {

	private static Map<Integer, Employee> employeeDB;
	
	static {
		employeeDB = new HashMap<Integer, Employee>(); 
		employeeDB.put(1, new Employee(1, "Gangadhar P", "Claims"));
		employeeDB.put(2, new Employee(2, "Pathipaka", "DBA"));
		employeeDB.put(3, new Employee(3, "Ishan", "Enrollment"));
		employeeDB.put(4, new Employee(4, "John", "CSR"));
	}
	
	public Collection<Employee> getAllEmployees() {
		return employeeDB.values();
	}
	
	public Employee getEmployee(int id) {
		return employeeDB.get(id);
	}
	
	public Employee deleteEmployee(int id) {
		return employeeDB.remove(id);
	}
	
	public void updateEmployee(Employee employee) {
		Employee emp = employeeDB.get(employee.getId());
		emp.setName(employee.getName());
		emp.setDepartment(employee.getDepartment());
	}
	
	public Employee createEmployee(Employee employee) {
		int empId = employeeDB.size() + 1;
		employee.setId(empId);
		employeeDB.put(empId, employee);
		return employee;
	}
}
