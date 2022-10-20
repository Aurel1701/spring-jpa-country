package com.soprasteria.springjpacountry.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.springjpacountry.Model.Region;

public interface RegionRepository extends CrudRepository<Region, Integer> {
	
	 // public List<Region> findByregion(String name);

}
