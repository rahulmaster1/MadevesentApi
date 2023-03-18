package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.OthersIdsCertificate;
import com.zcorp.medversant.api.repository.OtherIdsCeertificateReposirity;
@Service
public class OtherIdsCertificateServiceImpl implements OthersIdsCertificateService {
	@Autowired
	private OtherIdsCeertificateReposirity otherIdsCeertificateReposirity;
	@Override
	public OthersIdsCertificate addOtherIdsCertificate(OthersIdsCertificate otherIdsCertificate) {
		// TODO Auto-generated method stub
		return otherIdsCeertificateReposirity.save(otherIdsCertificate);
	}

}
