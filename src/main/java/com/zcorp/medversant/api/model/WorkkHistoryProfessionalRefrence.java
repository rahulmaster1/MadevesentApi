package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Workhistory_professionalRefrence")
public class WorkkHistoryProfessionalRefrence implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String middle;
	private String lastName;
	private String suffix;
	private String degree;
	private String primarySpecialty;
	private String contactMethod;
	private String addline1;
	private String addline2;
	private String city;
	private String state;
	private String zipCode;
	private String telephoneNo;
	private String ext;
	private String fax;
	private Boolean doesnothave;
	private String mobileNum;
	private String emailAdd;
	private Boolean doesnothave1;
	private String startDate;
	private String endDate;
	private Boolean persent;
	private String relationship;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddle() {
		return middle;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getPrimarySpecialty() {
		return primarySpecialty;
	}
	public void setPrimarySpecialty(String primarySpecialty) {
		this.primarySpecialty = primarySpecialty;
	}
	public String getContactMethod() {
		return contactMethod;
	}
	public void setContactMethod(String contactMethod) {
		this.contactMethod = contactMethod;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Boolean getDoesnothave() {
		return doesnothave;
	}
	public void setDoesnothave(Boolean doesnothave) {
		this.doesnothave = doesnothave;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public Boolean getDoesnothave1() {
		return doesnothave1;
	}
	public void setDoesnothave1(Boolean doesnothave1) {
		this.doesnothave1 = doesnothave1;
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
	public Boolean getPersent() {
		return persent;
	}
	public void setPersent(Boolean persent) {
		this.persent = persent;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public WorkkHistoryProfessionalRefrence(Integer id, String firstName, String middle, String lastName, String suffix,
			String degree, String primarySpecialty, String contactMethod, String addline1, String addline2, String city,
			String state, String zipCode, String telephoneNo, String ext, String fax, Boolean doesnothave,
			String mobileNum, String emailAdd, Boolean doesnothave1, String startDate, String endDate, Boolean persent,
			String relationship) {
		this.id = id;
		this.firstName = firstName;
		this.middle = middle;
		this.lastName = lastName;
		this.suffix = suffix;
		this.degree = degree;
		this.primarySpecialty = primarySpecialty;
		this.contactMethod = contactMethod;
		this.addline1 = addline1;
		this.addline2 = addline2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.telephoneNo = telephoneNo;
		this.ext = ext;
		this.fax = fax;
		this.doesnothave = doesnothave;
		this.mobileNum = mobileNum;
		this.emailAdd = emailAdd;
		this.doesnothave1 = doesnothave1;
		this.startDate = startDate;
		this.endDate = endDate;
		this.persent = persent;
		this.relationship = relationship;
	}
	public WorkkHistoryProfessionalRefrence() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
