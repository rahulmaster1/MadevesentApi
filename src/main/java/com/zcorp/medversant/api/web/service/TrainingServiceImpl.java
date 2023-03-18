package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.Training;
import com.zcorp.medversant.api.repository.TrainingRepository;
@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;
	@Override
	public Training addTraining(Training training) {
		// TODO Auto-generated method stub
		return trainingRepository.save(training);
	}

}
