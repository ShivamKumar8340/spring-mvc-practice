package springmvc.controller;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	// this method  is created for 	static data
		@RequestMapping("/home")
		public String home() {
			System.out.print("This is home url");
			return "index";	
		}
		
		
		// this method is created for Model
		@RequestMapping("/about")
		public String about(Model model) {
			System.out.print("This is about url for model ");
			model.addAttribute("name" ,"shivam");
			model.addAttribute("age",21);
			return "about";
			}
		
		// this method is created for ModelAndView
		
		@RequestMapping("help")
		public ModelAndView help() {
			System.out.print("This is help url for ModelAndView ");
			
			// creating MOdel and View object
			ModelAndView modelAndView = new ModelAndView();
			
			// setting the data
			modelAndView.addObject("address","Nagla Man Singh (Husainpur) Etah");
			
			
			// get time
			LocalDateTime time = LocalDateTime.now();
			modelAndView.addObject("nowTime",time);
			
			// setting view name
			modelAndView.setViewName("help");
			
			return modelAndView;
		}

}
