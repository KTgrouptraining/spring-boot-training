package com.springboottraining.helloworldapp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.entities.Mandals;
import com.springboottraining.helloworldapp.feign.client.CountriesFeignClient;
import com.springboottraining.helloworldapp.models.Countries;
import com.springboottraining.helloworldapp.models.MandalsModel;
import com.springboottraining.helloworldapp.service.MandalsService;

@RestController
public class MandalsController {

	Logger logger = LoggerFactory.getLogger(MandalsController.class);

	@Autowired
	private MandalsService mandalsService;
	@Autowired
	private CountriesFeignClient countriesFeignClient;

	@PostMapping(value = "/mandals/save", consumes = "application/json", produces = "application/json")
//	@PostMapping("/mandals/save")
	public ResponseEntity<String> saveMandal(@RequestBody MandalsModel mandalsModel) {
		logger.info("==========>Inut Request"+mandalsModel);
		return new ResponseEntity<String>(mandalsService.saveMandal(mandalsModel),HttpStatus.CREATED);

	}

	@PostMapping(value = "/mandals/save/data")
	public String saveMandalIfnotExisting(@RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsbaseOnInputparams(mandalsModel);

	}

	@GetMapping("/mandals")
	public ResponseEntity<List<Mandals>> getMandals() throws Exception {
		/*if(true){
			throw new Exception();
		}*/
		
		logger.info("==================>Am inside getMandals() method");
		
		return new ResponseEntity<List<Mandals>>(mandalsService.getMandals(), HttpStatus.OK);

	}
	
	@GetMapping("/mandals/countries")
	public Object getCountries() {
		return mandalsService.getCountries();

	}
	
	
	@GetMapping("feign/mandals/countries")
	public List<Countries> getCountriesUingFeignClient() {
		return countriesFeignClient.getCountries();

	}
	
	@PostMapping("/mandals/save/countries")
	public String saveCountries(@RequestBody Countries country) {
		return mandalsService.saveCountry(country);

	}
	@PostMapping("/feign/mandals/save/countries")
	public String saveCountriesUsingFeign(@RequestBody Countries country) {
		return countriesFeignClient.saveCountries(country);

	}

	@PostMapping("/mandals/state")
	public List<Mandals> getMandalsByState(@RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsByState(mandalsModel.getState());
	}

	@PostMapping("/mandals/{state}")
	public List<Mandals> getMandalsByStateUingPathparam(@PathVariable("state") String state) {
		return mandalsService.getMandalsByState(state);
	}

	@PostMapping("/mandals/usingqueryparam")
	public List<Mandals> getMandalsByStateUingQueryParam(@PathParam("state") String state) {
		return mandalsService.getMandalsByState(state);
	}

	@PostMapping("/mandals/stateanddistrict")
	public List<Mandals> getMandalsByStateAndDistrict(@RequestBody MandalsModel mandalsModel) {
		return mandalsService.getMandalsByStateAndDistrict(mandalsModel.getState(), mandalsModel.getDistrict());

	}

	@PutMapping("/mandal/update")
	public String updateMandals(@RequestBody MandalsModel mandalsModel) {

		logger.info("Request:{'}====================info log" + mandalsModel);
		logger.debug("Request:{'}====================debug log" + mandalsModel);
		return mandalsService.updateMandals(mandalsModel);

	}

	@DeleteMapping("/mandal/delete")
	public String deleteMandal(@RequestBody MandalsModel mandalsModel) {
//		return mandalsService.deleteMandal(mandalsModel.getMid());
		return mandalsService.deleteMandalByObject(mandalsModel);

	}

}
