package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.Disclosure;
import com.zcorp.medversant.api.repository.DisclosureReposirty;
@Service
public class DisclosureServiceImpl implements DisclosureService {

	@Autowired
	private DisclosureReposirty disclosureReposirty;
	@Override
	public Disclosure addDisclosure(Disclosure disclosure) {
		// TODO Auto-generated method stub
		return disclosureReposirty.save(disclosure);
	}

}
