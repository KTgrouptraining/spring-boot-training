package com.springboottraining.helloworldapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.entities.Mandals;
import com.springboottraining.helloworldapp.models.MandalsModel;
import com.springboottraining.helloworldapp.service.MandalsService;

@RestController
public class MandalsController {

	@Autowired
	private MandalsService mandalsService;

	@PostMapping(value = "/mandals/save", consumes = "application/json", produces = "application/json")
//	@PostMapping("/mandals/save")
	public String saveMandal(@RequestBody MandalsModel mandalsModel) {
		return mandalsService.saveMandal(mandalsModel);

	}
	
	@GetMapping("/mandals")
	public List<Mandals> getMandals() {
		return mandalsService.getMandals();

	}
	
	@PostMapping("/mandals/state")
	public List<Mandals> getMandalsByState( @RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsByState(mandalsModel.getState());
		  //vnsi

	}
	
	@PostMapping("/mandals/stateanddistrict")
	public List<Mandals> getMandalsByStateAndDistrict( @RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsByStateAndDistrict(mandalsModel.getState(), mandalsModel.getDistrict());

	}

}
