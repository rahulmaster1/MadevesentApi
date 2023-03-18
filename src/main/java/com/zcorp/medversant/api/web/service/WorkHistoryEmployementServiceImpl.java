package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.WorkHistoryEmployement;
import com.zcorp.medversant.api.repository.WorkHisteryEmployementRepositry;
@Service
public class WorkHistoryEmployementServiceImpl implements WorkHistoryEmployeementService {

	@Autowired
	private WorkHisteryEmployementRepositry employementRepositry;
	@Override
	public WorkHistoryEmployement addEmployeement(WorkHistoryEmployement workHistoryEmployement) {
		// TODO Auto-generated method stub
		return employementRepositry.save(workHistoryEmployement);
	}

}
