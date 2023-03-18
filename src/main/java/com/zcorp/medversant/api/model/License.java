package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "license")
public class License implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String licenseState; 
    private String licenseType; 
    private String licenseNumber; 
    private String licenseStatus;
    private String issueDate; 
    private String expirationDate;
    private Boolean doesNotExpire; 
    
    @ElementCollection
    private List<Sponsors> nameOfSponsor;
    

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getLicenseState() {
        return this.licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    public String getLicenseType() {
        return this.licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseStatus() {
        return this.licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean isDoesNotExpire() {
        return this.doesNotExpire;
    }

    public Boolean getDoesNotExpire() {
        return this.doesNotExpire;
    }

    public void setDoesNotExpire(Boolean doesNotExpire) {
        this.doesNotExpire = doesNotExpire;
    }

    public List<Sponsors> getNameOfSponsor() {
        return this.nameOfSponsor;
    }

    public void setNameOfSponsor(List<Sponsors> nameOfSponsor) {
        this.nameOfSponsor = nameOfSponsor;
    }

    public License(Integer Id, String licenseState, String licenseType, String licenseNumber, String licenseStatus, String issueDate, String expirationDate, Boolean doesNotExpire, List<Sponsors> nameOfSponsor) {
        this.Id = Id;
        this.licenseState = licenseState;
        this.licenseType = licenseType;
        this.licenseNumber = licenseNumber;
        this.licenseStatus = licenseStatus;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.doesNotExpire = doesNotExpire;
        this.nameOfSponsor = nameOfSponsor;
    }

    public License() {}
}
