package com.soprasteria.springjpacountry.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.springjpacountry.Model.Country;
import com.soprasteria.springjpacountry.repository.CountryRepository;


@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;
	
	@GetMapping("/country")
	public List<Country> getAllCountry() {
			return (List<Country>) countryRepository.findAll();
		
	}
	
	@GetMapping("/country/{countryId}")
	public Country getCountryById(@PathVariable(value = "countryId") int countryId) {
		java.util.Optional<Country> c=countryRepository.findById(countryId);
		if(c.isPresent())
			return c.get();
		else
			return new Country();
	}
	
	// create 
	@PostMapping("/api/country")
	public Country createStudent(@RequestBody Country country) {
		return countryRepository.save(country);

	}
	
	//delete
	
	@DeleteMapping("/country/{countryId}") //delete
	public void deleteCountryById(@PathVariable(value = "countryId") int countryId) {
		countryRepository.deleteById(countryId);
	}
}
