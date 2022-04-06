package com.springboottraining.helloworldapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.helloworldapp.entities.States;
import com.springboottraining.helloworldapp.models.StateModel;
import com.springboottraining.helloworldapp.repository.StatesRepository;

@Service
public class StatesService {

	@Autowired
	private StatesRepository statesRepository;

	public List<StateModel> getStates() {
		List<StateModel> finalStatesList = null;

//		return (List<States>) statesRepository.findAll();
		List<States> states = (List<States>) statesRepository.findAll();
		if (states != null && states.size() > 0) {
			finalStatesList = new ArrayList<StateModel>();

			for (States state : states) {
				StateModel stateMode = new StateModel();
				stateMode.setId(state.getSid());
				stateMode.setName(state.getName());
				finalStatesList.add(stateMode);

			}
		}
		return finalStatesList;

	}

}
