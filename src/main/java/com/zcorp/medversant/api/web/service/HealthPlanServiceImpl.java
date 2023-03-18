package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.HealthPlans;
import com.zcorp.medversant.api.repository.HealthPlanRepository;
@Service
public class HealthPlanServiceImpl implements HealthPlanService {
	@Autowired
	private HealthPlanRepository healthPlanRepository;
	@Override
	public HealthPlans addHealthPlan(HealthPlans healthPlans) {
		// TODO Auto-generated method stub
		return healthPlanRepository.save(healthPlans);
	}

}
