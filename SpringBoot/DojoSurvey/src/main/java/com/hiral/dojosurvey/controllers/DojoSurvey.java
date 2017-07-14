package com.hiral.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DojoSurvey {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String submit(HttpSession session, @RequestParam(value="name", defaultValue = "") String name, @RequestParam(value="location", defaultValue = "") String location, @RequestParam(value="language", defaultValue = "") String language, @RequestParam(value="description", defaultValue = "") String description, Model model){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("description", description);
		return "redirect:/resultDojo";
	}
	
	@RequestMapping("/resultDojo")
	public String result(){
		return "result";
	}
}
