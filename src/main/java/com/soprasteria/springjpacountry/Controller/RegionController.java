package com.soprasteria.springjpacountry.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soprasteria.springjpacountry.Model.Region;
import com.soprasteria.springjpacountry.repository.RegionRepository;

@Controller
@RequestMapping("/region")
public class RegionController {

	@Autowired
    private RegionRepository repoRegion;



   @GetMapping("/region")
    public List<Region>getRegions(){
	   return (List<Region>) repoRegion.findAll();
    }
   
   @GetMapping("/region/{regionId}")
   public Region getRegionById(@PathVariable(value = "regionId") int regionId) {
       Optional<Region> r=repoRegion.findById(regionId);
       if(r.isPresent())
           return r.get();
       else
           return new Region();
   }

  
}
