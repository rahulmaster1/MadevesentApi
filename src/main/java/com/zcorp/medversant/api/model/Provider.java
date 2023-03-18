package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "provider")
public class Provider implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer id; 

    private String firstName; 
    private String middleName; 
    private String lastName; 
    // @Enumerated(EnumType.STRING)
    private String suffix; 
    private String degreeTitles; 
    // @ElementCollection
    // private List<String> statesOfPractice;
    // @ElementCollection(fetch = FetchType.EAGER)
    // private Set<String> statesOfPractice;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "provider_statesOfPractice", joinColumns = @JoinColumn(name = "provider_id") )
    @Column(name = "state_id")
    private Set<String> statesOfPractice = new HashSet<>();    
    @ElementCollection(fetch = FetchType.EAGER)
    private List<OtherNames> otherNames;
    private String primaryPractitionerType; 
    
    //birth place
    private String defaultCountry;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String country;
    private String state;
    private String zipCode;
    private String telephoneNumber;
    private String faxNumber;
    private Boolean unlistedNumber;
    private String mobileNumber;
    private String pageNumber;
    private String ext;

    public Provider(Integer id, String firstName, String middleName, String lastName, String suffix,
            String degreeTitles, Set<String> statesOfPractice, List<OtherNames> otherNames, String primaryPractitionerType,
            String defaultCountry, String addressLine1, String addressLine2, String city, String country, String state,
            String zipCode, String telephoneNumber, String faxNumber, Boolean unlistedNumber, String mobileNumber,
            String pageNumber, String ext) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.degreeTitles = degreeTitles;
        this.statesOfPractice = statesOfPractice;
        this.otherNames = otherNames;
        this.primaryPractitionerType = primaryPractitionerType;
        this.defaultCountry = defaultCountry;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
        this.telephoneNumber = telephoneNumber;
        this.faxNumber = faxNumber;
        this.unlistedNumber = unlistedNumber;
        this.mobileNumber = mobileNumber;
        this.pageNumber = pageNumber;
        this.ext = ext;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDegreeTitles() {
        return this.degreeTitles;
    }

    public void setDegreeTitles(String degreeTitles) {
        this.degreeTitles = degreeTitles;
    }

    public Set<String> getStatesOfPractice() {
        return this.statesOfPractice;
    }

    public void setStatesOfPractice(Set<String> statesOfPractice) {
        this.statesOfPractice = statesOfPractice;
    }

    public List<OtherNames> getOtherNames() {
        return this.otherNames;
    }

    public void setOtherNames(List<OtherNames> otherNames) {
        this.otherNames = otherNames;
    }

    public String getPrimaryPractitionerType() {
        return this.primaryPractitionerType;
    }

    public void setPrimaryPractitionerType(String primaryPractitionerType) {
        this.primaryPractitionerType = primaryPractitionerType;
    }

    public String getDefaultCountry() {
        return this.defaultCountry;
    }

    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaxNumber() {
        return this.faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Boolean isUnlistedNumber() {
        return this.unlistedNumber;
    }

    public Boolean getUnlistedNumber() {
        return this.unlistedNumber;
    }

    public void setUnlistedNumber(Boolean unlistedNumber) {
        this.unlistedNumber = unlistedNumber;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
    
    public Provider() {

    }
}