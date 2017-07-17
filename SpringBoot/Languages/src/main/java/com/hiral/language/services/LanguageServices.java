package com.hiral.language.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.hiral.language.models.Language;

@Service
public class LanguageServices {
	private ArrayList<Language> languages = new ArrayList<Language>(Arrays.asList(
            new Language("Java", "James Gosling", 1.9),
            new Language("Python", "Guido van Russom", 3.6)
            ));
    
    public ArrayList<Language> allLanguages() {
        return languages;
    }
    // to display all languages
    public void addLanguages(Language language) {
        languages.add(language);
    }
    
    // to add language
    public void addLanguage(Language language) {
    	languages.add(language);
    }
    
    public void destroyLanguage(int id) {
        if (id < languages.size()){
            languages.remove(id);
        }
    }
    
    public Language findLanguageByIndex(int index) {
        if (index < languages.size()){
            return languages.get(index);
        }else{
            return null;
        }
    }
    
    public void updateLanguage(int id, Language language) {
        if (id < languages.size()){
            languages.set(id, language);
        }
    }
}
