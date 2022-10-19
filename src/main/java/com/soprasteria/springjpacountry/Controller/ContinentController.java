package com.soprasteria.springjpacountry.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.springjpacountry.Model.Continent;
import com.soprasteria.springjpacountry.repository.ContinentRepository;

@RestController
@RequestMapping("/continent") 
public class ContinentController {

	@Autowired
	private ContinentRepository continentRepo;
	
	@GetMapping("/continents")
	public List<Continent> getAllContinent(){
		return (List<Continent>) continentRepo.findAll();
		
	}
	
	
	@GetMapping("/continent/{continentId}")
	public Continent getContinentById(@PathVariable(value = "continentId") int continentId) {
		Optional<Continent> c=continentRepo.findById(continentId);
		if(c.isPresent())
			return c.get();
		else
			return new Continent();
	}
}