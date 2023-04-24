package com.ust.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                                 //classes which responds to incoming http requests(2 methods will come Get or post,   if it is get then it invokes the method which corresponds to get method here it is respond)
@RequestMapping("/home")                   //to know which controller to call
public class HomeController {
	    @GetMapping
		public String respond(Model model) {
			//model.addAttribute("myName","Aparna Jayaprakash");
			return "register";             //returns html file
		}
	}


