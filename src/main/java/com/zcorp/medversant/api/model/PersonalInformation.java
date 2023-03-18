package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "personal_information")
public class PersonalInformation implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String gender; 
    private String citizenship; 
    private String countryOfBirth; 
    @ElementCollection
    @CollectionTable(name = "provider_languagesSpeak", joinColumns = @JoinColumn(name = "provider_id"))
    @Column(name = "languagesSpeak_id")
    private Set<String> languagesSpeak;
    @ElementCollection
    @CollectionTable(name = "provider_languagesWrite", joinColumns = @JoinColumn(name = "provider_id"))
    @Column(name = "languagesWrite_id")
    private Set<String> languagesWrite; 
    private String ethnicity; 
    private String maritalStatuts;
    private String firstName; 
    private String middleName; 
    private String lastName;
    private int emergencyContactNo; 


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() {
        return this.citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public Set<String> getLanguagesSpeak() {
        return this.languagesSpeak;
    }

    public void setLanguagesSpeak(Set<String> languagesSpeak) {
        this.languagesSpeak = languagesSpeak;
    }

    public Set<String> getLanguagesWrite() {
        return this.languagesWrite;
    }

    public void setLanguagesWrite(Set<String> languagesWrite) {
        this.languagesWrite = languagesWrite;
    }

    public String getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getMaritalStatuts() {
        return this.maritalStatuts;
    }

    public void setMaritalStatuts(String maritalStatuts) {
        this.maritalStatuts = maritalStatuts;
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

    public int getEmergencyContactNo() {
        return this.emergencyContactNo;
    }

    public void setEmergencyContactNo(int emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public PersonalInformation(Integer id, String gender, String citizenship, String countryOfBirth, Set<String> languagesSpeak, Set<String> languagesWrite, String ethnicity, String maritalStatuts, String firstName, String middleName, String lastName, int emergencyContactNo) {
        this.id = id;
        this.gender = gender;
        this.citizenship = citizenship;
        this.countryOfBirth = countryOfBirth;
        this.languagesSpeak = languagesSpeak;
        this.languagesWrite = languagesWrite;
        this.ethnicity = ethnicity;
        this.maritalStatuts = maritalStatuts;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emergencyContactNo = emergencyContactNo;
    }

    public PersonalInformation() {
        
    }


}
