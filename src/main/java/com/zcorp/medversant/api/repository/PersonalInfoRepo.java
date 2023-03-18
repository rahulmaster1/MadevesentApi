package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.PersonalInformation;

public interface PersonalInfoRepo extends JpaRepository<PersonalInformation, Integer>{
    
}
