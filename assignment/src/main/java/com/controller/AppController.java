package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.entity.Project;
import com.service.EmployeeService;
import com.service.ProjectService;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public String registerPage(@RequestBody Employee p) {
		employeeService.addEmployee(p);
		return "User registered!!";
		
	}
	@GetMapping("/loadEmployee")
	public List<Employee> loadEmployees(){
		return employeeService.loadEmployees();
	}
	@GetMapping("/findEmployee/{pid}")
	public Employee findEmployee(@PathVariable int pid) {
		return employeeService.findEmployee(pid).get();
	}
	@DeleteMapping("/deleteEmployee/{pid}")
	public String deleteEmployee(@PathVariable int pid) {
		return employeeService.deleteEmployee(pid);
	}
}