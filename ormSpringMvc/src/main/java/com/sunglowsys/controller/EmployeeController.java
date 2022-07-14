package com.sunglowsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;


@Controller
public class EmployeeController {
	 
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String welcome( ) {
		System.out.println("home page is started");
		
		return "home";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String createForm(@ModelAttribute("employee") Employee employee,Model model ) {
		System.out.println("create form is started");
		System.out.println(employee);
		this.employeeService.createEmployee(employee);
		
		return "redirect:/";
		
	}
}
