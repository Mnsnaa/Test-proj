package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.ProgLanguage;
import com.example.demo.service.ProgLanguageService;


	

	
	@RestController
	@RequestMapping("/ProgLangauge")
	
	
	public class ProgLanguageController {
		
		
		private ProgLanguageService service;
		
		private ProgLanguageController(ProgLanguageService service) {
				
				this.service = service;
		}
	
	
		
		// Create 
		@PostMapping("/create")
		public ResponseEntity<ProgLanguage> crearteProgLanguage(@RequestBody ProgLanguage P ){
			return new ResponseEntity<ProgLanguage>(this.service.create(P), HttpStatus.CREATED);
			
		}
		
		
		// Read All
		@GetMapping
		public ResponseEntity<List<ProgLanguage>>ReadAllProgLanguage(){
			return new ResponseEntity<List<ProgLanguage>>(this.service.getALL(),HttpStatus.OK);
			
		}
		
		// Read by Id
		@GetMapping("/ReadById/{id}")
		public ResponseEntity<ProgLanguage>getP	(@PathVariable Long id){
			return new ResponseEntity<ProgLanguage>(this.service.getbyId(id), HttpStatus.OK);
		}
		
		// Update 
		@PutMapping("/Updateby/{id}")
		public ResponseEntity<ProgLanguage>updateProgLanguage(@PathVariable Long id , @RequestBody ProgLanguage P){
			return new ResponseEntity<ProgLanguage>(this.service.update(id, P), HttpStatus.ACCEPTED);
		}
		
		// Delete 
		@DeleteMapping("/deleteby/ {id}")
		public ResponseEntity<Boolean>deleteProgLanguage(@PathVariable Long id){
			return (this.service.delete(id))? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT):
				new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	

