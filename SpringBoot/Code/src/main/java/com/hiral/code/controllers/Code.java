package com.hiral.code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class Code {
	@RequestMapping("")
	public String index(){
		return "index";
	}
	
	@RequestMapping(path="/checkCode", method=RequestMethod.POST)
	public String submit(HttpSession session, @RequestParam(value="code", defaultValue = "") String code, RedirectAttributes errors){
		if(code.equals("bushido")){
			return "redirect:/getResult";
		}else{
			errors.addFlashAttribute("error", "You must train harder");
		}
		return "redirect:/";
	}
	
	@RequestMapping("/getResult")
	public String result(){
		return "code";
	}
}
