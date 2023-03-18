package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.Specialties;
import com.zcorp.medversant.api.repository.SpecialistRepository;
@Service
public class SpecialistServiceImpl implements SpecialistService {
	@Autowired
	private SpecialistRepository specialistRepository;

	@Override
	public Specialties addHealthPlan(Specialties specialties) {
		// TODO Auto-generated method stub
		return specialistRepository.save(specialties);
	}

}
