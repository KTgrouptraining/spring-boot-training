package com.springboottraining.helloworldapp.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottraining.helloworldapp.entities.Mandals;
import com.springboottraining.helloworldapp.models.MandalsModel;
import com.springboottraining.helloworldapp.repository.MandalsRepository;

@Service
public class MandalsService {

	Logger logger = LoggerFactory.getLogger(MandalsService.class);

	@Autowired
	private MandalsRepository mandalsRepository;

	public String saveMandal(MandalsModel mandalsModel) {

		String result = "no result";

		if (mandalsModel != null) {
			/*
			 * if (mandalsModel.getMid() != 0 && (mandalsModel.getName() != null &&
			 * !mandalsModel.getName().isEmpty()) && (mandalsModel.getState() != null &&
			 * !mandalsModel.getState().isEmpty()) && (mandalsModel.getDistrict() != null &&
			 * !mandalsModel.getDistrict().isEmpty())) {
			 */
			if ((mandalsModel.getName() != null && !mandalsModel.getName().isEmpty())
					&& (mandalsModel.getState() != null && !mandalsModel.getState().isEmpty())
					&& (mandalsModel.getDistrict() != null && !mandalsModel.getDistrict().isEmpty())) {

				Mandals mandal = new Mandals();
//				mandal.setMid(mandalsModel.getMid());
				mandal.setName(mandalsModel.getName());
				mandal.setState(mandalsModel.getState());
				mandal.setDistrict(mandalsModel.getDistrict());

				// add a call to mandals repository to check if the dta is is already existing
				// or not

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

	public List<Mandals> getMandalsByState(String state) {

		return mandalsRepository.findMandalByState(state);

	}

	public List<Mandals> getMandalsByStateAndDistrict(String state, String district) {

		return mandalsRepository.findMandalsByStateAndDistrict(state, district);

	}

	public List<Mandals> getMandals() {

		return (List<Mandals>) mandalsRepository.findAll();

	}

	public String getMandalsbaseOnInputparams(MandalsModel mandalsModel) {

		String result = null;

		Mandals mandal = mandalsRepository.findMandaslDataByCustomQuery(mandalsModel.getState(),
				mandalsModel.getDistrict(), mandalsModel.getName());
		if (mandal != null) {

			result = "There is an alredy a record existing with the given details.";
		} else {

			Mandals mandals = new Mandals();
			mandals.setName(mandalsModel.getName());
			mandals.setState(mandalsModel.getState());
			mandals.setDistrict(mandalsModel.getDistrict());

			mandals = mandalsRepository.save(mandals);
			if (mandals != null)
				result = "Record has been stored successfully!";
			else
				result = "Record is not stored due to some issue.";

		}
		return result;

	}

	public String updateMandals(MandalsModel mandalsModel) {
		logger.debug("Request-----------> {}" + mandalsModel);
		String result = "no result";

		if (mandalsModel != null && (mandalsModel.getMid() != 0)
				&& (mandalsModel.getName() != null && !mandalsModel.getName().isEmpty())) {

			Optional<Mandals> mandalFromDB = mandalsRepository.findById(mandalsModel.getMid());
			Mandals mandal = null;

			mandal = mandalFromDB.get();

			if (!mandalFromDB.isPresent()) {
				return "There are no records existing in DB  for updating!";
			} else {
				mandal = mandalFromDB.get();
			}

			if (mandal != null) {

				mandal.setName(mandalsModel.getName());

				mandal = mandalsRepository.save(mandal);
				if (mandal != null) {
					result = "Record has been updated successfully!";
				} else {
					result = "Record has not updated due to some issue!";
				}

			}
			logger.debug("Result {}" + result);

//			else {
//				result = "There are no records existing in DB  for updating!";
//			}

		}
		return result;

	}

	public String deleteMandal(int mandalId) {
		String result = null;

		if (mandalId != 0) {

			mandalsRepository.deleteById(mandalId);
			result = "Recordhas deleted scussessfullly";
		} else {
			result = "PLease enter valid value fr deletion";
		}
		return result;

	}

	public String deleteMandalByObject(MandalsModel mandalsModel) {
		String result = "No record is deleted";

		if (mandalsModel != null && mandalsModel.getMid() != 0) {

			Optional<Mandals> optionalmandal = mandalsRepository.findById(mandalsModel.getMid());

			if (optionalmandal.isPresent()) {
				Mandals mandal = optionalmandal.get();

				mandalsRepository.delete(mandal);
				result = "Recordhas deleted scussessfullly";
			} else {
				result = "PLease enter valid value fr deletion";
			}

		}
		return result;

	}
}
