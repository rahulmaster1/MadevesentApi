package com.zcorp.medversant.api.web.service;

import java.util.List;

import com.zcorp.medversant.api.model.Provider;

public interface ProviderService {
    public List<Provider> findAll();
    public String test();
    public List<String> getStates();

    public Provider createProvider(Provider provider);
}
