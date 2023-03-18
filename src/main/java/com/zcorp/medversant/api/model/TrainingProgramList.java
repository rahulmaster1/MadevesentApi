package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class TrainingProgramList implements Serializable {
	
	private String traingProgramLoction;
	private String traingProgramName;
	private String addline1;
	private String addline2;
	private String city;
	private String zipCode;
	private String telephone;
	private String ext;
	private String faxNum;
	private String emailAddress;
	private String typeofTraing;
	private String specialty;
	private String directorFirstName;
	private String directorLastName;
	private String directorDegree;
	private String directorEmail;
	private String startDate;
	private String endDate;
	private Boolean trainingInstitute;
	private String explainTraining;
	private String affProgramLoc;
	private String directorAddline1;
	private String directorAddline2;
	private String directorCity;
	private String directorzipCode;
	private String directorTelephone;
	private String directorExt;
	private String directorFaxNum;
	public String getTraingProgramLoction() {
		return traingProgramLoction;
	}
	public void setTraingProgramLoction(String traingProgramLoction) {
		this.traingProgramLoction = traingProgramLoction;
	}
	public String getTraingProgramName() {
		return traingProgramName;
	}
	public void setTraingProgramName(String traingProgramName) {
		this.traingProgramName = traingProgramName;
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
	public String getFaxNum() {
		return faxNum;
	}
	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTypeofTraing() {
		return typeofTraing;
	}
	public void setTypeofTraing(String typeofTraing) {
		this.typeofTraing = typeofTraing;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getDirectorFirstName() {
		return directorFirstName;
	}
	public void setDirectorFirstName(String directorFirstName) {
		this.directorFirstName = directorFirstName;
	}
	public String getDirectorLastName() {
		return directorLastName;
	}
	public void setDirectorLastName(String directorLastName) {
		this.directorLastName = directorLastName;
	}
	public String getDirectorDegree() {
		return directorDegree;
	}
	public void setDirectorDegree(String directorDegree) {
		this.directorDegree = directorDegree;
	}
	public String getDirectorEmail() {
		return directorEmail;
	}
	public void setDirectorEmail(String directorEmail) {
		this.directorEmail = directorEmail;
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
	public Boolean getTrainingInstitute() {
		return trainingInstitute;
	}
	public void setTrainingInstitute(Boolean trainingInstitute) {
		this.trainingInstitute = trainingInstitute;
	}
	public String getExplainTraining() {
		return explainTraining;
	}
	public void setExplainTraining(String explainTraining) {
		this.explainTraining = explainTraining;
	}
	public String getAffProgramLoc() {
		return affProgramLoc;
	}
	public void setAffProgramLoc(String affProgramLoc) {
		this.affProgramLoc = affProgramLoc;
	}
	public String getDirectorAddline1() {
		return directorAddline1;
	}
	public void setDirectorAddline1(String directorAddline1) {
		this.directorAddline1 = directorAddline1;
	}
	public String getDirectorAddline2() {
		return directorAddline2;
	}
	public void setDirectorAddline2(String directorAddline2) {
		this.directorAddline2 = directorAddline2;
	}
	public String getDirectorCity() {
		return directorCity;
	}
	public void setDirectorCity(String directorCity) {
		this.directorCity = directorCity;
	}
	public String getDirectorzipCode() {
		return directorzipCode;
	}
	public void setDirectorzipCode(String directorzipCode) {
		this.directorzipCode = directorzipCode;
	}
	public String getDirectorTelephone() {
		return directorTelephone;
	}
	public void setDirectorTelephone(String directorTelephone) {
		this.directorTelephone = directorTelephone;
	}
	public String getDirectorExt() {
		return directorExt;
	}
	public void setDirectorExt(String directorExt) {
		this.directorExt = directorExt;
	}
	public String getDirectorFaxNum() {
		return directorFaxNum;
	}
	public void setDirectorFaxNum(String directorFaxNum) {
		this.directorFaxNum = directorFaxNum;
	}
	public TrainingProgramList(String traingProgramLoction, String traingProgramName, String addline1, String addline2,
			String city, String zipCode, String telephone, String ext, String faxNum, String emailAddress,
			String typeofTraing, String specialty, String directorFirstName, String directorLastName,
			String directorDegree, String directorEmail, String startDate, String endDate, Boolean trainingInstitute,
			String explainTraining, String affProgramLoc, String directorAddline1, String directorAddline2,
			String directorCity, String directorzipCode, String directorTelephone, String directorExt,
			String directorFaxNum) {
		this.traingProgramLoction = traingProgramLoction;
		this.traingProgramName = traingProgramName;
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.city = city;
		this.zipCode = zipCode;
		this.telephone = telephone;
		this.ext = ext;
		this.faxNum = faxNum;
		this.emailAddress = emailAddress;
		this.typeofTraing = typeofTraing;
		this.specialty = specialty;
		this.directorFirstName = directorFirstName;
		this.directorLastName = directorLastName;
		this.directorDegree = directorDegree;
		this.directorEmail = directorEmail;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainingInstitute = trainingInstitute;
		this.explainTraining = explainTraining;
		this.affProgramLoc = affProgramLoc;
		this.directorAddline1 = directorAddline1;
		this.directorAddline2 = directorAddline2;
		this.directorCity = directorCity;
		this.directorzipCode = directorzipCode;
		this.directorTelephone = directorTelephone;
		this.directorExt = directorExt;
		this.directorFaxNum = directorFaxNum;
	}
	public TrainingProgramList() {
		// TODO Auto-generated constructor stub
	}
	

}
