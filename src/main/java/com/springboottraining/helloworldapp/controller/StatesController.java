package com.springboottraining.helloworldapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboottraining.helloworldapp.entities.States;
import com.springboottraining.helloworldapp.models.StateModel;
import com.springboottraining.helloworldapp.service.StatesService;

@RestController
public class StatesController {
	Logger logger = LoggerFactory.getLogger(StatesController.class);
	@Autowired
	private StatesService statesService;

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

		/*
		 * List<StateModel> states = new ArrayList<StateModel>(); // class name refname
		 * = new clasee() StateModel stateModel1 = new StateModel();
		 * stateModel1.setId(1); stateModel1.setName("AP"); states.add(stateModel1);
		 * 
		 * StateModel stateModel2 = new StateModel(); stateModel2.setId(2);
		 * stateModel2.setName("MP"); states.add(stateModel2);
		 */

		return statesService.getStates();

	}

}
