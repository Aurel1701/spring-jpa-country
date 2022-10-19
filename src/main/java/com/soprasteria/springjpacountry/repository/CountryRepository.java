package com.soprasteria.springjpacountry.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soprasteria.springjpacountry.Model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}