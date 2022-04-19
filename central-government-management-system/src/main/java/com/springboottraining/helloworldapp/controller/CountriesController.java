package com.springboottraining.helloworldapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.entities.Countries;
import com.springboottraining.helloworldapp.service.CountriesService;

@RestController
public class CountriesController {
	@Autowired
	private CountriesService countriesService;

	@GetMapping("/countries")
	public ResponseEntity<List<Countries>> getCountries() {
		return new ResponseEntity<List<Countries>>(
				countriesService.getCountries(), HttpStatus.OK);
	}

	@PostMapping("countries/save")
	public String saveCountry(@RequestBody Countries country) {
		return countriesService.saveCountry(country);

	}

}
