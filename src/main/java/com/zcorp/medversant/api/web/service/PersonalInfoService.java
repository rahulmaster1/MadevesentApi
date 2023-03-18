package com.zcorp.medversant.api.web.service;

import java.util.List;

import com.zcorp.medversant.api.model.PersonalInformation;
import com.zcorp.medversant.api.model.Provider;

public interface PersonalInfoService{

    public PersonalInformation addPersonalInformation(PersonalInformation personalInfo);
    public List<PersonalInformation> findAll();
    
}
