package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.HealthPlans;

public interface HealthPlanRepository extends JpaRepository<HealthPlans, Integer> {

}
