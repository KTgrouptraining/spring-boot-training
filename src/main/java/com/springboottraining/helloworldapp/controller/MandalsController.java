package com.springboottraining.helloworldapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.models.MandalsModel;
import com.springboottraining.helloworldapp.service.MandalsService;

@RestController
public class MandalsController {

	@Autowired
	private MandalsService mandalsService;

	@PostMapping(value = "/mandals/save", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public String saveMandal(MandalsModel mandalsModel) {
		return mandalsService.saveMandal(mandalsModel);

	}

}
