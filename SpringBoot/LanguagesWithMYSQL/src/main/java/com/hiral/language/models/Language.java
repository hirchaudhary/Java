package com.hiral.language.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Language {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Size(min = 2, max = 20)
    private String name;
    
	@Column
    @Size(min = 2, max = 20)
    private String creator;
    
	@Column
    @NotNull
    private Double currentVersion;

	@Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date created_at;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updated_at;
    
	public Language(String name, String creator, Double currentVersion, Date created_at, Date updated_at) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
		this.created_at = created_at;
        this.updated_at = updated_at;
	}
	@PrePersist
    protected void onCreate(){
            this.created_at = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
            this.updated_at = new Date();
    }
    
	public Language() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
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
