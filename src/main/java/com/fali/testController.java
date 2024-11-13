package com.fali;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class testController {
	
	@GetMapping("/")
	public String firstMethod() {
		return "Hi ,I welcome to my project";
	}
	
	@GetMapping("/about")
	public String getAboutMe() {
		return "hi, i am fali kumar sah,this is my first project while learning docker,thank you";
	}
	
	

}
