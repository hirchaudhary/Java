package com.hiral.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class NinjaGold {
	ArrayList<String> arr = new ArrayList<>();
	@RequestMapping("")
	public String index(HttpSession session){
		if(session.getAttribute("gold")==null){
			session.setAttribute("gold", 0);
		}
		return "index";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session){
		if(session != null){
			session.invalidate();
		}
		arr.clear();
		return "redirect:/";
	}
	
	@RequestMapping(path="/gold/{id}", method=RequestMethod.POST)
	public String survey(@PathVariable int id,Model model, HttpSession session){
		Random rnd = new Random();
		int gold = 0;
		
		String result = "";
		switch(id){
			case 1:
				gold = rnd.nextInt(10)+10;
				result += "You entered farm and earned " +gold+ "gold.";
				break;
			case 2:
				gold = rnd.nextInt(5)+5;
				result += "You entered cave and earned " +gold+ "gold.";
				break;
			case 3:
				gold = rnd.nextInt(3)+2;
				result += "You entered house and earned " +gold+ "gold.";
				break;
			case 4:
				gold = rnd.nextInt(100)-50;
				if(gold < 0){
					result += "You entered casino and loose " +gold+ "gold.";
				}else if(gold > 0){
					result += "You entered casino and earned " +gold+ "gold.";
				}else {
					result += "You neither win nor loose";
				}
				break;
		}
		session.setAttribute("gold", (Integer)session.getAttribute("gold")+gold);
		arr.add(result);
		session.setAttribute("activities", arr);
		return "redirect:/";
	}
}