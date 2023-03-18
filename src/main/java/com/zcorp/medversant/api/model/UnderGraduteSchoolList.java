package com.zcorp.medversant.api.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UnderGraduteSchoolList {
	private String schoolLocation;
	private String schoolName;
	private String addline1;
	private String addline2;
	private String city;
	private String zipCode;
	private String telephone;
	private String ext;
	private String faxNumer;
	private String undergraduteMajor;
	private String degreeAward;
	private Boolean undergraduteSchool;
	private String startDate;
	private String endDate;
	public String getSchoolLocation() {
		return schoolLocation;
	}
	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddline1() {
		return addline1;
	}
	public void setAddline1(String addline1) {
		this.addline1 = addline1;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getFaxNumer() {
		return faxNumer;
	}
	public void setFaxNumer(String faxNumer) {
		this.faxNumer = faxNumer;
	}
	public String getUndergraduteMajor() {
		return undergraduteMajor;
	}
	public void setUndergraduteMajor(String undergraduteMajor) {
		this.undergraduteMajor = undergraduteMajor;
	}
	public String getDegreeAward() {
		return degreeAward;
	}
	public void setDegreeAward(String degreeAward) {
		this.degreeAward = degreeAward;
	}
	public Boolean getUndergraduteSchool() {
		return undergraduteSchool;
	}
	public void setUndergraduteSchool(Boolean undergraduteSchool) {
		this.undergraduteSchool = undergraduteSchool;
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
	public UnderGraduteSchoolList(String schoolLocation, String schoolName, String addline1, String addline2,
			String city, String zipCode, String telephone, String ext, String faxNumer, String undergraduteMajor,
			String degreeAward, Boolean undergraduteSchool, String startDate, String endDate) {
		this.schoolLocation = schoolLocation;
		this.schoolName = schoolName;
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.city = city;
		this.zipCode = zipCode;
		this.telephone = telephone;
		this.ext = ext;
		this.faxNumer = faxNumer;
		this.undergraduteMajor = undergraduteMajor;
		this.degreeAward = degreeAward;
		this.undergraduteSchool = undergraduteSchool;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public UnderGraduteSchoolList() {
	}
	

}
