package com.springboottraining.helloworldapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.models.StateModel;

@RestController
public class StatesController {

	/*
	 * @RequestMapping("/states/list") public List<String> getStates() {
	 * 
	 * List states = new ArrayList<>(); states.add("Andhra Pradesh");
	 * states.add("Madhya Pradesh"); states.add("Uttar Pradesh"); return states;
	 * 
	 * }
	 */

	@RequestMapping("/states/list")
	public List<StateModel> getStates() {

		List<StateModel> states = new ArrayList<StateModel>();
		// class name refname = new clasee()
		StateModel stateModel1 = new StateModel();
		stateModel1.setId(1);
		stateModel1.setName("AP");
		states.add(stateModel1);

		StateModel stateModel2 = new StateModel();
		stateModel2.setId(2);
		stateModel2.setName("MP");
		states.add(stateModel2);

		return states;

	}

}
