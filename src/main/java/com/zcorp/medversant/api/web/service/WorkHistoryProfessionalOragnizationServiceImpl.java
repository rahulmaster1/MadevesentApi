package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.WorkHistoryProfessionalOragnization;
import com.zcorp.medversant.api.repository.WorkHistoryProfessionalOragnizationReposirty;
@Service
public class WorkHistoryProfessionalOragnizationServiceImpl implements WorkHistoryProfessionalOragnizationService {

	@Autowired
	private WorkHistoryProfessionalOragnizationReposirty historyProfessionalOragnizationReposirty;
	@Override
	public WorkHistoryProfessionalOragnization addProfessionalOragnization(
			WorkHistoryProfessionalOragnization historyProfessionalOragnization) {
		// TODO Auto-generated method stub
		return historyProfessionalOragnizationReposirty.save(historyProfessionalOragnization);
	}

}
