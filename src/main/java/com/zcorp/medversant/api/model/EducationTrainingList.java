package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class EducationTrainingList  implements Serializable{

	private String carrirLocm;
	private String employerName;
	private String contactFirstName;
	private String contactLastName;
	private String addLine1;
	private String addline2;
	private String city;
	private String zipCode;
	private String telephoneNum;
	private String ext;
	private String faxNum;
	private String email;
	private String contactMethod;
	private String positionHeld;
	private String startDate;
	private String endDate;
	private Boolean present;
	public String getCarrirLocm() {
		return carrirLocm;
	}
	public void setCarrirLocm(String carrirLocm) {
		this.carrirLocm = carrirLocm;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddline2() {
		return addline2;
	}
	public void setAddline2(String addline2) {
		this.addline2 = addline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTelephoneNum() {
		return telephoneNum;
	}
	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getFaxNum() {
		return faxNum;
	}
	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
	}
	public String getPositionHeld() {
		return positionHeld;
	}
	public void setPositionHeld(String positionHeld) {
		this.positionHeld = positionHeld;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Boolean getPresent() {
		return present;
	}
	public void setPresent(Boolean present) {
		this.present = present;
	}
	public EducationTrainingList(String carrirLocm, String employerName, String contactFirstName,
			String contactLastName, String addLine1, String addline2, String city, String zipCode, String telephoneNum,
			String ext, String faxNum, String email, String contactMethod, String positionHeld, String startDate,
			String endDate, Boolean present) {
		this.carrirLocm = carrirLocm;
		this.employerName = employerName;
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.addLine1 = addLine1;
		this.addline2 = addline2;
		this.city = city;
		this.zipCode = zipCode;
		this.telephoneNum = telephoneNum;
		this.ext = ext;
		this.faxNum = faxNum;
		this.email = email;
		this.contactMethod = contactMethod;
		this.positionHeld = positionHeld;
		this.startDate = startDate;
		this.endDate = endDate;
		this.present = present;
	}
	public EducationTrainingList() {
	}
	
	
	
	
}
