package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.Training;

public interface TrainingRepository extends JpaRepository<Training, Integer> {

}
