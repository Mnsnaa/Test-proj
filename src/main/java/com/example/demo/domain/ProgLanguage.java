package com.example.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;






@Entity
public class ProgLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message= " Add the Proglanguage name ")
	private String name; 
	
	@Column
	private short ranking;
	
	@NotNull
	private Boolean popular;
	
	
	//Default constructor
	
	public ProgLanguage() {
		
	}
	
	// For Testing 
	
	public ProgLanguage(Long Id , String name , Short ranking, Boolean popular) {
		super();
		this.id = Id;
		this.name = name;
		this.ranking = ranking;
		this.popular = popular;
		
	}
	
	// For Creating 
	
	public ProgLanguage(String name, Short ranking, Boolean popular) {
		super();
		this.name = name;
		this.ranking = ranking;
		this.popular = popular;	
	}
	
	
	
	
}
