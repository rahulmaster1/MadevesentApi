package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.WorkkHistoryProfessionalRefrence;
import com.zcorp.medversant.api.repository.WorkkHistoryProfessionalRefrenceReposirty;
@Service
public class WorkkHistoryProfessionalRefrenceServiceImpl implements WorkkHistoryProfessionalRefrenceService {
	
	@Autowired
	private WorkkHistoryProfessionalRefrenceReposirty historyProfessionalRefrenceReposirty;

	@Override
	public WorkkHistoryProfessionalRefrence addProfessionalRefrence(
			WorkkHistoryProfessionalRefrence historyProfessionalRefrence) {
		// TODO Auto-generated method stub
		return historyProfessionalRefrenceReposirty.save(historyProfessionalRefrence);
	}

}
