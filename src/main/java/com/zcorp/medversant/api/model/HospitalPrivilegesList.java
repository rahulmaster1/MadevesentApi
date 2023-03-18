package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class HospitalPrivilegesList implements Serializable{
	
	private String facLocation;
	private String facName;
	private String officeAddline1;
	private String officeAddline2;
	private String city;
	private String zipCode;
	private String officeTelephone;
	private String ext;
	private String officFaxnum;
	private String departmentName;
	private String devisionName;
	private String firstName;
	private String lastName;
	private Boolean privilegesTemp;
	private Boolean privilegesTemp1;
	private String privilgesStatus;
	private Boolean longerBussiness;
	public String getFacLocation() {
		return facLocation;
	}
	public void setFacLocation(String facLocation) {
		this.facLocation = facLocation;
	}
	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public String getOfficeAddline1() {
		return officeAddline1;
	}
	public void setOfficeAddline1(String officeAddline1) {
		this.officeAddline1 = officeAddline1;
	}
	public String getOfficeAddline2() {
		return officeAddline2;
	}
	public void setOfficeAddline2(String officeAddline2) {
		this.officeAddline2 = officeAddline2;
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
	public String getOfficeTelephone() {
		return officeTelephone;
	}
	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getOfficFaxnum() {
		return officFaxnum;
	}
	public void setOfficFaxnum(String officFaxnum) {
		this.officFaxnum = officFaxnum;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDevisionName() {
		return devisionName;
	}
	public void setDevisionName(String devisionName) {
		this.devisionName = devisionName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Boolean getPrivilegesTemp() {
		return privilegesTemp;
	}
	public void setPrivilegesTemp(Boolean privilegesTemp) {
		this.privilegesTemp = privilegesTemp;
	}
	public Boolean getPrivilegesTemp1() {
		return privilegesTemp1;
	}
	public void setPrivilegesTemp1(Boolean privilegesTemp1) {
		this.privilegesTemp1 = privilegesTemp1;
	}
	public String getPrivilgesStatus() {
		return privilgesStatus;
	}
	public void setPrivilgesStatus(String privilgesStatus) {
		this.privilgesStatus = privilgesStatus;
	}
	public Boolean getLongerBussiness() {
		return longerBussiness;
	}
	public void setLongerBussiness(Boolean longerBussiness) {
		this.longerBussiness = longerBussiness;
	}
	public HospitalPrivilegesList(String facLocation, String facName, String officeAddline1, String officeAddline2,
			String city, String zipCode, String officeTelephone, String ext, String officFaxnum, String departmentName,
			String devisionName, String firstName, String lastName, Boolean privilegesTemp, Boolean privilegesTemp1,
			String privilgesStatus, Boolean longerBussiness) {
		this.facLocation = facLocation;
		this.facName = facName;
		this.officeAddline1 = officeAddline1;
		this.officeAddline2 = officeAddline2;
		this.city = city;
		this.zipCode = zipCode;
		this.officeTelephone = officeTelephone;
		this.ext = ext;
		this.officFaxnum = officFaxnum;
		this.departmentName = departmentName;
		this.devisionName = devisionName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.privilegesTemp = privilegesTemp;
		this.privilegesTemp1 = privilegesTemp1;
		this.privilgesStatus = privilgesStatus;
		this.longerBussiness = longerBussiness;
	}
	public HospitalPrivilegesList() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
