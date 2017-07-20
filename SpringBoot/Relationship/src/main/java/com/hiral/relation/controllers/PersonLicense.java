package com.hiral.relation.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiral.relation.models.License;
import com.hiral.relation.models.Person;
import com.hiral.relation.services.LicenseServices;
import com.hiral.relation.services.PersonServices;

@Controller
@RequestMapping("/")
public class PersonLicense {
	private PersonServices personServices;
	private LicenseServices licenseServices;
	
	public PersonLicense(PersonServices personServices, LicenseServices licenseServices) {
		this.personServices = personServices;
		this.licenseServices = licenseServices;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("person") Person person){
		return "index";
	}
	
	@PostMapping("/person/new")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result){
		if(result.hasErrors()){
			return "index";
		}else{
			personServices.addPerson(person);
			return "redirect:/";
		}
	}	
	
	@RequestMapping("/license/new")
	public String createLicense(@ModelAttribute("license") License license, Model model){
		model.addAttribute("persons", personServices.getPersons());
		return "addlicense";
	}
	
	@PostMapping("/license/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model){
		model.addAttribute("persons", personServices.getPersons());
		if(result.hasErrors()){
			return "addlicense";
		}else{		
		    String count = (String) result.getFieldValue("person.id");
		    String str = String.format("%06d", Integer.parseInt(count));
			license.setNumber(str);
			licenseServices.createLicense(license);
			return "redirect:/";
		}
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}
	
	@RequestMapping("/person/license")
	public String information(Model model){
		model.addAttribute("licenses", licenseServices.getInfo());
		return "information";
	}
}
