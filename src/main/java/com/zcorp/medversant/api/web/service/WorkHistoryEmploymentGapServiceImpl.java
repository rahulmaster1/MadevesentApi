package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.WorkHistoryEmploymentGap;
import com.zcorp.medversant.api.repository.WorkHistoryEmploymentGapReposirty;
@Service
public class WorkHistoryEmploymentGapServiceImpl implements WorkHistoryEmploymentGapService {
	
	@Autowired
	private WorkHistoryEmploymentGapReposirty employmentGapReposirty;
	

	@Override
	public WorkHistoryEmploymentGap addEmployment(WorkHistoryEmploymentGap employmentGap) {
		// TODO Auto-generated method stub
		return employmentGapReposirty.save(employmentGap);
	}

}
