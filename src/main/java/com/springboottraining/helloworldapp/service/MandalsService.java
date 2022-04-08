package com.springboottraining.helloworldapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.helloworldapp.entities.Mandals;
import com.springboottraining.helloworldapp.models.MandalsModel;
import com.springboottraining.helloworldapp.repository.MandalsRepository;

@Service
public class MandalsService {

	@Autowired
	private MandalsRepository mandalsRepository;

	public String saveMandal(MandalsModel mandalsModel) {
		
		String result = null;

		if (mandalsModel != null) {
			if (mandalsModel.getMid() != 0 && (mandalsModel.getName() != null && !mandalsModel.getName().isEmpty())
					&& (mandalsModel.getState() != null && !mandalsModel.getState().isEmpty())
					&& (mandalsModel.getDistrict() != null && !mandalsModel.getDistrict().isEmpty())) {

				Mandals mandal = new Mandals();
				mandal.setMid(mandalsModel.getMid());
				mandal.setName(mandalsModel.getName());
				mandal.setState(mandalsModel.getState());
				mandal.setDistrict(mandalsModel.getDistrict());

				mandal = mandalsRepository.save(mandal);
				if (mandal != null) {

					result = "Record has been stored successfully!";
				} else {
					result = "Record is not stored due to some issue.";
				}

			}

		}

		return result;

	}

}
