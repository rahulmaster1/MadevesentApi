package com.zcorp.medversant.api.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.PersonalInformation;
import com.zcorp.medversant.api.repository.PersonalInfoRepo;

@Service
public class PersonalInfoServiceImpl implements PersonalInfoService{
    
    @Autowired
    private PersonalInfoRepo personalInfoRepo;

    public PersonalInformation addPersonalInformation(PersonalInformation personalInfo) {
        return personalInfoRepo.save(personalInfo);
    }

	
	public List<PersonalInformation> findAll() {
		// TODO Auto-generated method stub
		return personalInfoRepo.findAll();
	}
}
