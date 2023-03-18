package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "practiceInfo_credentialContact")
public class PracticeInfoCredentialContact implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer id;
	private String prefferdMethod;
	private String fistName;
	private String lastName;
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private String zipCode;
	private String telephoneNum;
	private String ext;
	private String faxNo;
	private Boolean doesNotHave;
	private String mobile;
	private String emailAddress;
	private Boolean doesNotHave1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrefferdMethod() {
		return prefferdMethod;
	}
	public void setPrefferdMethod(String prefferdMethod) {
		this.prefferdMethod = prefferdMethod;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	public Boolean getDoesNotHave() {
		return doesNotHave;
	}
	public void setDoesNotHave(Boolean doesNotHave) {
		this.doesNotHave = doesNotHave;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Boolean getDoesNotHave1() {
		return doesNotHave1;
	}
	public void setDoesNotHave1(Boolean doesNotHave1) {
		this.doesNotHave1 = doesNotHave1;
	}
	public PracticeInfoCredentialContact(Integer id, String prefferdMethod, String fistName, String lastName,
			String addLine1, String addLine2, String city, String state, String zipCode, String telephoneNum,
			String ext, String faxNo, Boolean doesNotHave, String mobile, String emailAddress, Boolean doesNotHave1) {
		this.id = id;
		this.prefferdMethod = prefferdMethod;
		this.fistName = fistName;
		this.lastName = lastName;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.telephoneNum = telephoneNum;
		this.ext = ext;
		this.faxNo = faxNo;
		this.doesNotHave = doesNotHave;
		this.mobile = mobile;
		this.emailAddress = emailAddress;
		this.doesNotHave1 = doesNotHave1;
	}
	public PracticeInfoCredentialContact() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
