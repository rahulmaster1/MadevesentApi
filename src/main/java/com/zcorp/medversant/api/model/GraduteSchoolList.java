package com.zcorp.medversant.api.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class GraduteSchoolList {
	
	private String educationType;
	private String schoolLocation;
	private String schoolName;
	private String addLine1;
	private String addLine2;
	private String city;
	private String zipCode;
	private String telephone;
	private String ext;
	private String faxNumber;
	private String gradutionType;
	private String specialization;
	private String degreeAward;
	private String directFirstName;
	private String directLastName;
	private String directDegree;
	private Boolean undergradute;
	private String startDate;
	private String lastDate;
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
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
	public String getAddLine1() {
		return addLine1;
	}
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}
	public String getAddLine2() {
		return addLine2;
	}
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
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
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getGradutionType() {
		return gradutionType;
	}
	public void setGradutionType(String gradutionType) {
		this.gradutionType = gradutionType;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDegreeAward() {
		return degreeAward;
	}
	public void setDegreeAward(String degreeAward) {
		this.degreeAward = degreeAward;
	}
	public String getDirectFirstName() {
		return directFirstName;
	}
	public void setDirectFirstName(String directFirstName) {
		this.directFirstName = directFirstName;
	}
	public String getDirectLastName() {
		return directLastName;
	}
	public void setDirectLastName(String directLastName) {
		this.directLastName = directLastName;
	}
	public String getDirectDegree() {
		return directDegree;
	}
	public void setDirectDegree(String directDegree) {
		this.directDegree = directDegree;
	}
	public Boolean getUndergradute() {
		return undergradute;
	}
	public void setUndergradute(Boolean undergradute) {
		this.undergradute = undergradute;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public GraduteSchoolList(String educationType, String schoolLocation, String schoolName, String addLine1,
			String addLine2, String city, String zipCode, String telephone, String ext, String faxNumber,
			String gradutionType, String specialization, String degreeAward, String directFirstName,
			String directLastName, String directDegree, Boolean undergradute, String startDate, String lastDate) {
		this.educationType = educationType;
		this.schoolLocation = schoolLocation;
		this.schoolName = schoolName;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.zipCode = zipCode;
		this.telephone = telephone;
		this.ext = ext;
		this.faxNumber = faxNumber;
		this.gradutionType = gradutionType;
		this.specialization = specialization;
		this.degreeAward = degreeAward;
		this.directFirstName = directFirstName;
		this.directLastName = directLastName;
		this.directDegree = directDegree;
		this.undergradute = undergradute;
		this.startDate = startDate;
		this.lastDate = lastDate;
	}
	public GraduteSchoolList() {
		// TODO Auto-generated constructor stub
	}
	

}
