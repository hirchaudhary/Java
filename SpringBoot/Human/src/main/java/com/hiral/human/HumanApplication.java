package com.hiral.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
	
	
	@RequestMapping("/")
	public String index(@RequestParam(value="a", defaultValue = "Human") String first, @RequestParam(value="b", defaultValue = "Human") String last, Model model){
		model.addAttribute("first", first);
		model.addAttribute("last", last);
		return "index";
	}
	
}
