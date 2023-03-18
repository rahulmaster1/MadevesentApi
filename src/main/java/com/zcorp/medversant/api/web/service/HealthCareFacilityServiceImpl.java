package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.HealthCareFacility;
import com.zcorp.medversant.api.repository.HealthCareFacilityRepository;
@Service
public class HealthCareFacilityServiceImpl implements HealthCareFaciltyService {

	@Autowired
	private HealthCareFacilityRepository careFacilityRepository;
	@Override
	public HealthCareFacility addHealthCareFacility(HealthCareFacility healthCareFacility) {
		// TODO Auto-generated method stub
		return careFacilityRepository.save(healthCareFacility);
	}

}
