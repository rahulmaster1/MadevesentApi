package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class TeachingAppointmentList implements Serializable {
	
	private String teachingAppLoc;
	private String teachingAppName;
	private String addLine1;
	private String addLine2;
	private String city;
	private String zipcode;
	private String telephone;
	private String ext;
	private String  faxNum;
	private String email;
	private String directorFirstName;
	private String directorLastName;
	private String directorDegree;
	private String  academicRank;
	private String startDate;
	private String endDate;
	private Boolean doesnotexit;
	public String getTeachingAppLoc() {
		return teachingAppLoc;
	}
	public void setTeachingAppLoc(String teachingAppLoc) {
		this.teachingAppLoc = teachingAppLoc;
	}
	public String getTeachingAppName() {
		return teachingAppName;
	}
	public void setTeachingAppName(String teachingAppName) {
		this.teachingAppName = teachingAppName;
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
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAcademicRank() {
		return academicRank;
	}
	public void setAcademicRank(String academicRank) {
		this.academicRank = academicRank;
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
	public Boolean getDoesnotexit() {
		return doesnotexit;
	}
	public void setDoesnotexit(Boolean doesnotexit) {
		this.doesnotexit = doesnotexit;
	}
	public TeachingAppointmentList(String teachingAppLoc, String teachingAppName, String addLine1, String addLine2,
			String city, String zipcode, String telephone, String ext, String faxNum, String email,
			String directorFirstName, String directorLastName, String directorDegree, String academicRank,
			String startDate, String endDate, Boolean doesnotexit) {
		this.teachingAppLoc = teachingAppLoc;
		this.teachingAppName = teachingAppName;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.zipcode = zipcode;
		this.telephone = telephone;
		this.ext = ext;
		this.faxNum = faxNum;
		this.email = email;
		this.directorFirstName = directorFirstName;
		this.directorLastName = directorLastName;
		this.directorDegree = directorDegree;
		this.academicRank = academicRank;
		this.startDate = startDate;
		this.endDate = endDate;
		this.doesnotexit = doesnotexit;
	}
	public TeachingAppointmentList() {
		// TODO Auto-generated constructor stub
	}
	

}
