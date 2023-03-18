package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.Education;
import com.zcorp.medversant.api.repository.EducationRepository;
@Service
public class EducationServiceImpl implements EducationService {
	@Autowired
	private EducationRepository educationRepository;
	@Override
	public Education addEducation(Education education) {
		// TODO Auto-generated method stub
		return educationRepository.save(education);
	}


}
