package com.hiral.lookify.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.lookify.models.Songs;
import com.hiral.lookify.repositories.LookifyRepository;
@Service
public class LookifyServices {
	private LookifyRepository lookifyRepository;

	public LookifyServices(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	
	public List<Songs> allSongs(){
		return (List<Songs>) lookifyRepository.findAll();
	}
	
	public void addSong(Songs song){
		lookifyRepository.save(song);
	}
	
	public void deleteSong(Long id){
		lookifyRepository.delete(id);
	}
	
	public  Songs findSongs(Long id){
		return lookifyRepository.findOne(id);
	}
	
	public List<Songs> findByArtist(String artist){
		 return lookifyRepository.findByArtistContaining(artist);
	}
	
	public List<Songs> findTop10(){
		 return (List<Songs>) lookifyRepository.findAllByOrderByRatingDesc();
	}
}
