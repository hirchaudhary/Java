package com.hiral.relation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.relation.models.License;
import com.hiral.relation.repositories.LicenseRepository;

@Service
public class LicenseServices {
	private LicenseRepository licenseRepository;
	
	public LicenseServices(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public void createLicense(License license){
		licenseRepository.save(license);
	}
	
	public List<License> getInfo(){
		return (List<License>) licenseRepository.findAll();
	}
}
