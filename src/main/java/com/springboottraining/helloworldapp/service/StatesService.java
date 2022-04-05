package com.springboottraining.helloworldapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.helloworldapp.entities.States;
import com.springboottraining.helloworldapp.repository.StatesRepository;

@Service
public class StatesService {

	@Autowired
	private StatesRepository statesRepository;

	public List<States> getStates() {

		return (List<States>) statesRepository.findAll();

	}

}
