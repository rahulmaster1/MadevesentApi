package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.PracticeInfoUniqueCircu;
import com.zcorp.medversant.api.web.response.PracticeInfoUniqueCircuReposirty;
@Service
public class PracticeInfoUniqueCircuServiceImpl implements PracticeInfoUniqueCircuService {

	@Autowired
	private PracticeInfoUniqueCircuReposirty practiceInfoUniqueCircuReposirty;
	@Override
	public PracticeInfoUniqueCircu addUniqueCircu(PracticeInfoUniqueCircu practiceInfoUniqueCircu) {
		// TODO Auto-generated method stub
		return practiceInfoUniqueCircuReposirty.save(practiceInfoUniqueCircu);
	}

}
