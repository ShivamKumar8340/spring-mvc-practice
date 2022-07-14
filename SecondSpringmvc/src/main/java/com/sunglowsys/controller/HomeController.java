package com.sunglowsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunglowsys.domain.Student;

@Controller
public class HomeController {
	
	
	// this method is use for provide same data  in all view page by @ModelAttribute
	
	@ModelAttribute
	public void commonDataforModel(Model m) {
		m.addAttribute("Header","Hello User");
		m.addAttribute("Description","welcome to student portal");
		
		
	}

	// this is complete application for sending data from view to controller

	// this method is only for show html form
	@RequestMapping("contact")
	public String showForm() {
		System.out.println(" This is a contactForm");
		return "contact";
	}

	/*
	 * // this method is for process(insert ) the data
	 * 
	 * @RequestMapping(path = "/processform", method= RequestMethod.POST ) 
	 * 
	 *  public String handleForm(
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("name") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model ) {
	 * 
	 * 
	 * 
	 * 
	 * // this is for print in local not view page System.out.println("user email :"
	 * +userEmail); System.out.println("user name : "+userName);
	 * System.out.println("user pass : "+ userPassword);
	 * 
	 * 
	 * //process
	 * 
	 * model.addAttribute("email",userEmail); model.addAttribute("name",userName);
	 * model.addAttribute("password",userPassword);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // we can use this instead of addAtttribute one by one this is a better way
	 * by creating a POJO class
	 * 
	 * Student student = new Student(); student.setEmail(userEmail);
	 * student.setName(userName); student.setPassword(userPassword);
	 * model.addAttribute("student" , student);
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * we can use more simple way by using @ModelAttribute instead of @requestParam
	 * this work same in few lines that we worked in a lot of lines code above
	 */	
	@RequestMapping(path = "/processform" ,method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Student student , Model model) {
		
		System.out.println("this is processurl");
	// this is return view page by which we can see out in the browser
	return"success";

}

}
