package com.zcorp.medversant.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zcorp.medversant.api.model.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer>{
    // List<Provider> findAll();
    @Query(value = "SELECT state FROM States", nativeQuery = true)
    List<String> getStates();
}
