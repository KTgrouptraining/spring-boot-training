package com.springboottraining.helloworldapp.feign.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboottraining.helloworldapp.models.Countries;

@FeignClient(url = "http://localhost:9091", name = "COUNTRIES-CLIENT")
public interface CountriesFeignClient {

	@GetMapping("/countries")
	public List<Countries> getCountries();

	/*
	 * public String saveCountry(Countries country) { HttpHeaders headers = new
	 * HttpHeaders(); headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	 * HttpEntity<String> entity = new HttpEntity<String>(headers);
	 * 
	 * 
	 * Countries country = new Countries(); country.setcId(101);
	 * country.setName("US");
	 * 
	 * 
	 * return restTemplate.postForObject( "http://localhost:9091/countries/save",
	 * country, String.class);
	 * 
	 * }
	 */

	@PostMapping("/countries/save")
	public String saveCountries(Countries country);

}
