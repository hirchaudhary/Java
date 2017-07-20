package com.hiral.dojos.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiral.dojos.models.Dojo;
import com.hiral.dojos.models.Ninja;
import com.hiral.dojos.services.DojoService;
import com.hiral.dojos.services.NinjaService;

@Controller
@RequestMapping("/")
public class ControllerRoute {
	private DojoService dojoService;
	private NinjaService ninjaService;
	
	
	public ControllerRoute(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}

	@RequestMapping("")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model){
		model.addAttribute("dojos", dojoService.allDojos());
		return "index";
	}
	
	@PostMapping("/dojo/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
		if(result.hasErrors()){
			return "index";
		}else{
			dojoService.addDojo(dojo);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model){
		model.addAttribute("dojos", dojoService.allDojos());
		return "ninja";
	}
	
	@PostMapping("/ninja/new")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
		if(result.hasErrors()){
			return "ninja";
		}else{
			ninjaService.addNinja(ninja);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/dojo/{id}")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model, @PathVariable("id") Long id){
		model.addAttribute("dojos", dojoService.findOneDojo(id));
		return "byid";
	}
	
}
