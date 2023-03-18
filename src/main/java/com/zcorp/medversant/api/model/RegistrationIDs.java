package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "registration_id")
public class RegistrationIDs implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 

    private String npiNumber;
    private String deaReason; 
    private String cdsReason;
    
    @ElementCollection
    private List<DeaRegistrationNo> deaRegistrationNo;
    @ElementCollection
    private List<CdsRegistrationNo> cdsRegistrationNo;
    @ElementCollection
    private List<Registration> registration; 


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNpiNumber() {
        return this.npiNumber;
    }

    public void setNpiNumber(String npiNumber) {
        this.npiNumber = npiNumber;
    }

    public String getDeaReason() {
        return this.deaReason;
    }

    public void setDeaReason(String deaReason) {
        this.deaReason = deaReason;
    }

    public String getCdsReason() {
        return this.cdsReason;
    }

    public void setCdsReason(String cdsReason) {
        this.cdsReason = cdsReason;
    }

    public List<DeaRegistrationNo> getDeaRegistrationNo() {
        return this.deaRegistrationNo;
    }

    public void setDeaRegistrationNo(List<DeaRegistrationNo> deaRegistrationNo) {
        this.deaRegistrationNo = deaRegistrationNo;
    }

    public List<CdsRegistrationNo> getCdsRegistrationNo() {
        return this.cdsRegistrationNo;
    }

    public void setCdsRegistrationNo(List<CdsRegistrationNo> cdsRegistrationNo) {
        this.cdsRegistrationNo = cdsRegistrationNo;
    }

    public List<Registration> getRegistration() {
        return this.registration;
    }

    public void setRegistration(List<Registration> registration) {
        this.registration = registration;
    }


    public RegistrationIDs(Integer id, String npiNumber, String deaReason, String cdsReason, List<DeaRegistrationNo> deaRegistrationNo, List<CdsRegistrationNo> cdsRegistrationNo, List<Registration> registration) {
        this.id = id;
        this.npiNumber = npiNumber;
        this.deaReason = deaReason;
        this.cdsReason = cdsReason;
        this.deaRegistrationNo = deaRegistrationNo;
        this.cdsRegistrationNo = cdsRegistrationNo;
        this.registration = registration;
    }

    public RegistrationIDs() {}

}
