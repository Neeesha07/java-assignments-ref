package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);

	}

	@Override
	public List<Employee> loadEmployees() {
		
		return (List<Employee>) repo.findAll();
	}

	@Override
	public Optional<Employee> findEmployee(int empId) {
		
		return repo.findById(empId);
	}

	@Override
	public String deleteEmployee(int empId) {
		repo.deleteById(empId);
		return "Employee deleted";
	}

}
