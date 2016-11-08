package com.ganga.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ganga.domain.Employee;
import com.ganga.service.EmployeeService;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

	@Autowired
	@Qualifier("empService")
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public Employee deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id); 
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
}
