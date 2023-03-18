package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.Specialties;

public interface SpecialistRepository extends JpaRepository<Specialties, Integer> {

}
