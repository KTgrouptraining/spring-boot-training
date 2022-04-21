package com.springboottraining.helloworldapp.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboottraining.helloworldapp.models.Countries;

@FeignClient(url="http://localhost:9093",name="COUNTRIES-CLIENT")
public interface StatesFeignClient {
	
	@GetMapping("/states")
	public List<Countries> getStates();
	
	@PostMapping("/states/save")
	public String saveStates(Countries country);

}
