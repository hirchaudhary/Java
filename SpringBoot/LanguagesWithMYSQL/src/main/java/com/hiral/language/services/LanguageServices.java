package com.hiral.language.services;

import org.springframework.stereotype.Service;

import com.hiral.language.models.Language;
import com.hiral.language.repositories.LanguageRepository;

@Service
public class LanguageServices {
	private LanguageRepository languageRepository;
	
	public LanguageServices(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
    public Iterable<Language> allLanguages() {
        return languageRepository.findAll();
    }

    public void addLanguage(Language language) {
    	languageRepository.save(language);
    }
    
    public void destroyLanguage(Long id) {
        languageRepository.delete(id);
    }
    
    public Language findLanguageById(Long id) {
        return languageRepository.findOne(id);
    }
    
    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }
}
