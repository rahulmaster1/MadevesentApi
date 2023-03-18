package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.PracticeInfoCredentialContact;
import com.zcorp.medversant.api.repository.PracticeInfoCredentialContactReposirty;
@Service
public class PracticeInfoCredentialContactServiceImpl implements PracticeInfoCredentialContactService {

	@Autowired
	private PracticeInfoCredentialContactReposirty contactReposirty;
	@Override
	public PracticeInfoCredentialContact addCredentialContact(
			PracticeInfoCredentialContact practiceInfoCredentialContact) {
		// TODO Auto-generated method stub
		return contactReposirty.save(practiceInfoCredentialContact);
	}

}
