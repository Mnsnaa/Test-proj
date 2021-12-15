package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.domain.ProgLanguage;
import com.example.demo.repo.ProgLanguageRepo;




@Service
public class ProgLanguageService implements ServiceMethods<ProgLanguage> {
	
	
	private ProgLanguageRepo repo;
	
	// Constructor
	
	public ProgLanguageService(ProgLanguageRepo repo) {
		this.repo = repo;
	}
	
		@Override
	public ProgLanguage create(ProgLanguage P) {
		// TODO Auto-generated method stub
			
		return this.repo.save(P);
	}



	@Override
	public List<ProgLanguage> getALL() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}



	@Override
	public ProgLanguage getbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ProgLanguage update(Long id, ProgLanguage P) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Boolean delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	
}
