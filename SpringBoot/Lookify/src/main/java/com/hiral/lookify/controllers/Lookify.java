package com.hiral.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hiral.lookify.models.Songs;
import com.hiral.lookify.services.LookifyServices;

@Controller
@RequestMapping("/")
public class Lookify {
	private final LookifyServices lookifyServices;
	public Lookify(LookifyServices lookifyServices){
		this.lookifyServices = lookifyServices;
	}
	@RequestMapping("")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("artist") Songs artist, BindingResult result){
		List<Songs> songs = lookifyServices.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard";
	}
	
	@RequestMapping("/song/new")
	public String addNewSong(@ModelAttribute("song") Songs song, BindingResult result){
		return "new";
	}
	
	@PostMapping("/addSong")
	public String addSongs(@Valid @ModelAttribute("song") Songs song, BindingResult result) {
		if(result.hasErrors()){
			return "new";
		}else{
			lookifyServices.addSong(song);
			return "redirect:/dashboard";
		}	
	}
	
	@RequestMapping("/song/delete/{id}")
	public String addNewSong(@PathVariable("id") Long id){
		lookifyServices.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/song/about/{id}")
	public String findSong(@PathVariable("id") Long id, Model model){
		Songs song = lookifyServices.findSongs(id);
		model.addAttribute("song", song);
		return "about";
	}

	@RequestMapping("/search/artist")
	public String search(@RequestParam("artist") String artist, @ModelAttribute("artist") String search, BindingResult result, Model model){
		List<Songs> song = lookifyServices.findByArtist(artist);
		model.addAttribute("byArtist", song);
		return "byartist";
	}
	
	@RequestMapping("/songs/top")
	public String topTen(Model model){
		List<Songs> songs = lookifyServices.findTop10();
		model.addAttribute("songs", songs);
		System.out.println(songs);
		return "topten";
	}
}
