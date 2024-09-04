package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.Employee;



public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	
	public List<Employee> loadEmployees();
	
	public Optional<Employee> findEmployee(int empId);


	String deleteEmployee(int empId);
}
