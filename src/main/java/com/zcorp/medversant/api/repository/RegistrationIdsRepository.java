package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.RegistrationIDs;

public interface RegistrationIdsRepository extends JpaRepository<RegistrationIDs, Integer>{
    
}
