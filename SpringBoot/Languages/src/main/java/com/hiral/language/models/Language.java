package com.hiral.language.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Language {
	@Size(min = 2, max = 20)
    private String name;
    
    @Size(min = 2, max = 20)
    private String creator;
    
    @NotNull
    private Double currentVersion;

	public Language(String name, String creator, Double currentVersion) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}

	public Language() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(Double currentVersion) {
		this.currentVersion = currentVersion;
	}
    
}
