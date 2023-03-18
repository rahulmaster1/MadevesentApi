package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.PracticeInfoCoveringCollegues;
import com.zcorp.medversant.api.repository.PracticeInfoCoveringColleguesReposirty;
@Service
public class PracticeInfoCoveringColleguesServiceImpl implements PracticeInfoCoveringColleguesService {

	@Autowired
	private PracticeInfoCoveringColleguesReposirty colleguesReposirty;
	@Override
	public PracticeInfoCoveringCollegues addCoveringCollegues(
			PracticeInfoCoveringCollegues practiceInfoCoveringCollegues) {
		// TODO Auto-generated method stub
		return colleguesReposirty.save(practiceInfoCoveringCollegues);
	}

}
