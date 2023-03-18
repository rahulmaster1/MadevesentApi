package com.zcorp.medversant.api.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.Provider;
import com.zcorp.medversant.api.repository.ProviderRepository;

@Service
public class ProviderServiceImpl implements ProviderService{

    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    @Override
    public Provider createProvider (Provider provider) {
        return providerRepository.save(provider);
        // List<String> statesOfPracticesList = new ArrayList<String>();
        // statesOfPracticesList.addAll(provider.getStatesOfPractice());
        // provider.setStatesOfPractice(statesOfPracticesList);

        // return providerRepository.save(provider);
    }

    @Override 
    public List<String> getStates() {
        return providerRepository.getStates();
    }

    @Override
    public String test() {
        return "Test String";
    }
}
