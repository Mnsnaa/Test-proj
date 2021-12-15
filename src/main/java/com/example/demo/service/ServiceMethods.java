package com.example.demo.service;


import java.util.List;


public interface ServiceMethods<T> {
	
	
	// Create 
	
	T create( T P);
	
	// Read All 
	
	List<T> getALL();
	
	// Read by ID
	
	T getbyId ( Long id);
	
	// Update 
	
	T update (Long id, T P);
	
	// Delete
	
	Boolean delete (long id);
	

}
