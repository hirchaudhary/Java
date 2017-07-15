package com.hiral.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/m/38/0483/{id}")
public class Learning {
	
	@RequestMapping("")
	public String courses(@PathVariable int id){
		if(id == 2331){
			return "setup";
		}
		if(id == 2332){
			return "form";
		}
		if(id == 2333){
			return "card";
		}
		return "redirect:/";
	}
}