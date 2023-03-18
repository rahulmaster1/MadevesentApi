package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class OtherNames implements Serializable{

    private String nameType; 
    private String dateStartedUsing;
    private String dateStoppedUsing;
    private Boolean currentlyInUse; 
    private String otherFirstName; 
    private String otherMiddleName; 
    private String otherLastName;
    private String otherSuffix;  

    public OtherNames(String nameType, String dateStartedUsing, String dateStoppedUsing, Boolean currentlyInUse, String otherFirstName, String otherMiddleName, String otherLastName, String otherSuffix) {
        this.nameType = nameType;
        this.dateStartedUsing = dateStartedUsing;
        this.dateStoppedUsing = dateStoppedUsing;
        this.currentlyInUse = currentlyInUse;
        this.otherFirstName = otherFirstName;
        this.otherMiddleName = otherMiddleName;
        this.otherLastName = otherLastName;
        this.otherSuffix = otherSuffix;
    }


    public String getNameType() {
        return this.nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDateStartedUsing() {
        return this.dateStartedUsing;
    }

    public void setDateStartedUsing(String dateStartedUsing) {
        this.dateStartedUsing = dateStartedUsing;
    }

    public String getDateStoppedUsing() {
        return this.dateStoppedUsing;
    }

    public void setDateStoppedUsing(String dateStoppedUsing) {
        this.dateStoppedUsing = dateStoppedUsing;
    }

    public Boolean isCurrentlyInUse() {
        return this.currentlyInUse;
    }

    public Boolean getCurrentlyInUse() {
        return this.currentlyInUse;
    }

    public void setCurrentlyInUse(Boolean currentlyInUse) {
        this.currentlyInUse = currentlyInUse;
    }

    public String getOtherFirstName() {
        return this.otherFirstName;
    }

    public void setOtherFirstName(String otherFirstName) {
        this.otherFirstName = otherFirstName;
    }

    public String getOtherMiddleName() {
        return this.otherMiddleName;
    }

    public void setOtherMiddleName(String otherMiddleName) {
        this.otherMiddleName = otherMiddleName;
    }

    public String getOtherLastName() {
        return this.otherLastName;
    }

    public void setOtherLastName(String otherLastName) {
        this.otherLastName = otherLastName;
    }

    public String getOtherSuffix() {
        return this.otherSuffix;
    }

    public void setOtherSuffix(String otherSuffix) {
        this.otherSuffix = otherSuffix;
    }

    public OtherNames() {}
    
}
