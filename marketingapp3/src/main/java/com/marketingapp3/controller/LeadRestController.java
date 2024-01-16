package com.marketingapp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp3.entity.Lead;
import com.marketingapp3.repository.LeadRepository;

@RestController
@RequestMapping("/leads/api")
public class LeadRestController {
	@Autowired
	private LeadRepository leadRepo;
  
	//http://localhost:8080/leads/api
	@GetMapping
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	
	@PostMapping
	public void saveLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	//http://localhost:8080/leads/api?id=7
	@PutMapping
	public void saveLead(@RequestBody Lead lead,
			             @RequestParam("id")long id) {
		lead.setId(id);
		leadRepo.save(lead);
		
	}
	
	@DeleteMapping
	public void deleteLead(@RequestParam("id") long id) {
		leadRepo.deleteById(id);
	}
}
