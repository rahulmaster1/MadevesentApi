package com.zcorp.medversant.api.web.service;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.License;
import com.zcorp.medversant.api.repository.LicenseRepository;

@Service
public class LicenseServiceImpl implements LicenseService {
    
    @Autowired
    private LicenseRepository licenseRepository; 

    @Override
    public License addLicense(License license) {
        return licenseRepository.save(license);
    }
    
}
