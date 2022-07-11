package com.sunglowsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	// this is complete application for sending data from view to controller
	
	
	// this method is only for show html form
	@RequestMapping("contact")
	public String showForm() {
		System.out.println(" This is a contactForm");
		return "contact";
	}
	
	
	
	// this method is for process(insert ) the data 
	@RequestMapping(path = "/processform", method= RequestMethod.POST )
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword,
			Model model
			) {
		
		
			// this is for print in local not view page
			System.out.println("user email :" +userEmail);
			System.out.println("user name : "+userName);
			System.out.println("user pass : "+ userPassword);
			
			
			
			//process 
			
			model.addAttribute("email",userEmail);
			model.addAttribute("name",userName);
			model.addAttribute("password",userPassword);
			
		
			
			// this is return view page by which we can see out in the browser 
		return "success";
		
	}

}
