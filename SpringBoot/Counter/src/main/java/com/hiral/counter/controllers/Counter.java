package com.hiral.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Counter {
	@RequestMapping("")
	public String index(HttpSession session){
		Integer str = (Integer) session.getAttribute("count");
		
		if(str != null){
			session.setAttribute("count", str+1);
		}else{
			session.setAttribute("count",0);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session){
		Integer str = (Integer) session.getAttribute("count");
		if(str == null){
			session.setAttribute("count",0);
		}
		return "count.jsp";
	}
	
	@RequestMapping("/counterAdd")
	public String counterAdd(HttpSession session){
		Integer str = (Integer) session.getAttribute("count2");
		
		if(str != null){
			session.setAttribute("count2", str+2);
		}else{
			session.setAttribute("count2",0);
		}
		return "count2.jsp";
	}

	@RequestMapping("/reset")
	public String reset(HttpSession session){
		session.invalidate();
		return "redirect:/counter";
	}
}
