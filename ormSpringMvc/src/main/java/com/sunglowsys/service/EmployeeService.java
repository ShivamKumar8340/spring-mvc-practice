package com.sunglowsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void createEmployee(Employee employee) {
		this.employeeRepository.saveEmployee(employee);
		
	}

}
