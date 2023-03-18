package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Registration implements Serializable{
    
    private String registrationNo;
    private String specialty; 
    private String state; 
    private String issuingBoard; 
    private String addressLine1; 
    private String addressLine2;
    private String city;
    private int zipCode;
    private int telephoneNo;
    private int ext; 
    private int faxNumber;
    private String issueDate;
    private String expirationDate;
    private Boolean doesNotExpire;
    private Boolean practicingNumberFlag;


    public String getRegistrationNo() {
        return this.registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIssuingBoard() {
        return this.issuingBoard;
    }

    public void setIssuingBoard(String issuingBoard) {
        this.issuingBoard = issuingBoard;
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

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getTelephoneNo() {
        return this.telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public int getExt() {
        return this.ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }

    public int getFaxNumber() {
        return this.faxNumber;
    }

    public void setFaxNumber(int faxNumber) {
        this.faxNumber = faxNumber;
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

    public Boolean isDoNotExpire() {
        return this.doesNotExpire;
    }

    public Boolean getDoNotExpire() {
        return this.doesNotExpire;
    }

    public void setDoNotExpire(Boolean doNotExpire) {
        this.doesNotExpire = doNotExpire;
    }

    public Boolean isPracticingNumberFlag() {
        return this.practicingNumberFlag;
    }

    public Boolean getPracticingNumberFlag() {
        return this.practicingNumberFlag;
    }

    public void setPracticingNumberFlag(Boolean practicingNumberFlag) {
        this.practicingNumberFlag = practicingNumberFlag;
    }


    public Registration(String registrationNo, String specialty, String state, String issuingBoard, String addressLine1, String addressLine2, String city, int zipCode, int telephoneNo, int ext, int faxNumber, String issueDate, String expirationDate, Boolean doNotExpire, Boolean practicingNumberFlag) {
        this.registrationNo = registrationNo;
        this.specialty = specialty;
        this.state = state;
        this.issuingBoard = issuingBoard;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.zipCode = zipCode;
        this.telephoneNo = telephoneNo;
        this.ext = ext;
        this.faxNumber = faxNumber;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.doesNotExpire = doNotExpire;
        this.practicingNumberFlag = practicingNumberFlag;
    }

    public Registration() {}
    
}
