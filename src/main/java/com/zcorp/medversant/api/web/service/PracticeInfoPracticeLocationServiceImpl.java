package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.PracticeInfoPracticeLocation;
import com.zcorp.medversant.api.repository.PracticeInfoPracticeLocationReposirty;
@Service
public class PracticeInfoPracticeLocationServiceImpl implements PracticeInfoPracticeLocationService {

	@Autowired
	private PracticeInfoPracticeLocationReposirty infoPracticeLocationReposirty;
	@Override
	public PracticeInfoPracticeLocation addPracticeLocation(PracticeInfoPracticeLocation practiceInfoPracticeLocation) {
		// TODO Auto-generated method stub
		return infoPracticeLocationReposirty.save(practiceInfoPracticeLocation);
	}

}
