package com.hiral.language.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiral.language.models.Language;
import com.hiral.language.services.LanguageServices;


@Controller
@RequestMapping("/")
public class Languages {
	private final LanguageServices languageService;
    public Languages(LanguageServices languageService){
        this.languageService = languageService;
    }
	
	@RequestMapping("")
	public String index(Model model, @ModelAttribute("language") Language language) {
		Iterable<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
		return "index";
	}
	
	@RequestMapping("/language/about/{id}")
    public String index(@PathVariable("id") Long id, Model model){
    	Language language = languageService.findLanguageById(id);
    	model.addAttribute("language", language);
    	return "about";
    }
	 
	@PostMapping("/language/add")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		Iterable<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
		if (result.hasErrors()) {
            return "index";
        }else{
            languageService.addLanguage(language);
            return "redirect:/";
        }
    }
	
	@RequestMapping(value="/language/delete/{id}")
    public String destroyLanguage(@PathVariable("id") Long id) {
        languageService.destroyLanguage(id);
        return "redirect:/";
    }
	
	@RequestMapping("/language/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguageById(id);
        if (language != null){
            model.addAttribute("language", language);
            return "edit";
        }else{
            return "redirect:/";
        }
    }
	
	@PostMapping("/language/edit/{id}")
    public String updateLanguage(@Valid @PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit";
        }else{
            languageService.updateLanguage(language);
            return "redirect:/";
        }
    }
}
