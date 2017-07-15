package com.hiral.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexRoute {
	@RequestMapping("")
	public String index(){
		return "index";
	}
}
