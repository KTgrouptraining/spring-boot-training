package com.springboottraining.helloworldapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.helloworldapp.entities.Countries;
import com.springboottraining.helloworldapp.repository.CountriesRepository;

@Service
public class CountriesService {

	Logger logger = LoggerFactory.getLogger(CountriesService.class);

	@Autowired
	private CountriesRepository countriesRepository;

	public List<Countries> getCountries() {

		return (List<Countries>) countriesRepository.findAll();

	}

	public String saveCountry(Countries country) {
		String result = null;
		Countries dataFromDB = countriesRepository.save(country);
		if (dataFromDB != null) {
			result = "Data stored successfully";
		} else {
			result = "Issue in saving the data ,Pleasetry again";
		}
		return result;

	}

}
