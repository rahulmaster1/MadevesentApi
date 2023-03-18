package com.zcorp.medversant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zcorp.medversant.api.model.Disclosure;

public interface DisclosureReposirty extends JpaRepository<Disclosure, Integer> {

}
