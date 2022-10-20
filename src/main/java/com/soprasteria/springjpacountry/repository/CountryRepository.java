package com.soprasteria.springjpacountry.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soprasteria.springjpacountry.Model.Country;
import com.soprasteria.springjpacountry.Model.Region;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {
	
	public List<Country> findByRegion(Region r);

}