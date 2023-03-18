package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class DeaRegistrationNo implements Serializable{
    
    private String registrationNo;
    private String registrationState; 
    private String issueDate; 
    private String expirationDate; 
    private boolean doNotExpire; 
    private boolean fullSchedule;


    public String getRegistrationNo() {
        return this.registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRegistrationState() {
        return this.registrationState;
    }

    public void setRegistrationState(String registrationState) {
        this.registrationState = registrationState;
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

    public boolean isDoNotExpire() {
        return this.doNotExpire;
    }

    public boolean getDoNotExpire() {
        return this.doNotExpire;
    }

    public void setDoNotExpire(boolean doNotExpire) {
        this.doNotExpire = doNotExpire;
    }

    public boolean isFullSchedule() {
        return this.fullSchedule;
    }

    public boolean getFullSchedule() {
        return this.fullSchedule;
    }

    public void setFullSchedule(boolean fullSchedule) {
        this.fullSchedule = fullSchedule;
    }

    public DeaRegistrationNo(String registrationNo, String registrationState, String issueDate, String expirationDate, boolean doNotExpire, boolean fullSchedule) {
        this.registrationNo = registrationNo;
        this.registrationState = registrationState;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.doNotExpire = doNotExpire;
        this.fullSchedule = fullSchedule;
    }

    public DeaRegistrationNo() {}

}
