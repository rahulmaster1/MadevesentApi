package com.zcorp.medversant.api.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.RegistrationIDs;
import com.zcorp.medversant.api.repository.RegistrationIdsRepository;

@Service
public class RegistrationIdsServiceImpl implements RegistrationIdsService{
    
    @Autowired
    private RegistrationIdsRepository registrationIdsRepository;

    public RegistrationIDs addRegistrationIDs(RegistrationIDs registrationIds){
        return registrationIdsRepository.save(registrationIds);
    }
}
