package com.hiral.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/m/26/0553/{id}")
public class Platform {

	@RequestMapping("")
	public String courses(@PathVariable int id){
		if(id == 2341){
			return "advance";
		}
		if(id == 2342){
			return "binary";
		}
		
		return "redirect:/";
	}	
}
