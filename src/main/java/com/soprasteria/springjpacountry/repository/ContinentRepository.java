package com.soprasteria.springjpacountry.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soprasteria.springjpacountry.Model.Continent;
import com.soprasteria.springjpacountry.Model.Country;

@Repository
public interface ContinentRepository extends CrudRepository<Continent, Integer> {

}
