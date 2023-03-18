package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PracticeInfo_CoveringCollegues")
public class PracticeInfoCoveringCollegues implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean coveringColleguesSwith;
	private String fisrtName;
	private String middleName;
	private String lastName;
	private String degree;
	private String npiNum;
	private String spacialty;
	private String primaryLicenceState;
	private String primaryLicenceNumber;
	private String primaryLicenceType;
	private String addLine1;
	private String addLine2;
	private String city;
	private String state;
	private String zipCode;
	private String telephone;
	private String ext;
	private String faxNum;
	private String emailAdd;
	private String explainCoveringCollegues;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getCoveringColleguesSwith() {
		return coveringColleguesSwith;
	}
	public void setCoveringColleguesSwith(Boolean coveringColleguesSwith) {
		this.coveringColleguesSwith = coveringColleguesSwith;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getNpiNum() {
		return npiNum;
	}
	public void setNpiNum(String npiNum) {
		this.npiNum = npiNum;
	}
	public String getSpacialty() {
		return spacialty;
	}
	public void setSpacialty(String spacialty) {
		this.spacialty = spacialty;
	}
	public String getPrimaryLicenceState() {
		return primaryLicenceState;
	}
	public void setPrimaryLicenceState(String primaryLicenceState) {
		this.primaryLicenceState = primaryLicenceState;
	}
	public String getPrimaryLicenceNumber() {
		return primaryLicenceNumber;
	}
	public void setPrimaryLicenceNumber(String primaryLicenceNumber) {
		this.primaryLicenceNumber = primaryLicenceNumber;
	}
	public String getPrimaryLicenceType() {
		return primaryLicenceType;
	}
	public void setPrimaryLicenceType(String primaryLicenceType) {
		this.primaryLicenceType = primaryLicenceType;
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
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getExplainCoveringCollegues() {
		return explainCoveringCollegues;
	}
	public void setExplainCoveringCollegues(String explainCoveringCollegues) {
		this.explainCoveringCollegues = explainCoveringCollegues;
	}
	public PracticeInfoCoveringCollegues(Integer id, Boolean coveringColleguesSwith, String fisrtName,
			String middleName, String lastName, String degree, String npiNum, String spacialty,
			String primaryLicenceState, String primaryLicenceNumber, String primaryLicenceType, String addLine1,
			String addLine2, String city, String state, String zipCode, String telephone, String ext, String faxNum,
			String emailAdd, String explainCoveringCollegues) {
		this.id = id;
		this.coveringColleguesSwith = coveringColleguesSwith;
		this.fisrtName = fisrtName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.degree = degree;
		this.npiNum = npiNum;
		this.spacialty = spacialty;
		this.primaryLicenceState = primaryLicenceState;
		this.primaryLicenceNumber = primaryLicenceNumber;
		this.primaryLicenceType = primaryLicenceType;
		this.addLine1 = addLine1;
		this.addLine2 = addLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.telephone = telephone;
		this.ext = ext;
		this.faxNum = faxNum;
		this.emailAdd = emailAdd;
		this.explainCoveringCollegues = explainCoveringCollegues;
	}
	public PracticeInfoCoveringCollegues() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
