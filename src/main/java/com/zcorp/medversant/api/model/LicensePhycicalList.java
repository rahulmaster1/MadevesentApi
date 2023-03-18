package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class LicensePhycicalList implements Serializable {
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String suffix;
	private String degree;
	private String physicianlicensestate;
	private String physicianlicensenumber;
	private String medicarenumber;
	private String npinumber;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getPhysicianlicensestate() {
		return physicianlicensestate;
	}
	public void setPhysicianlicensestate(String physicianlicensestate) {
		this.physicianlicensestate = physicianlicensestate;
	}
	public String getPhysicianlicensenumber() {
		return physicianlicensenumber;
	}
	public void setPhysicianlicensenumber(String physicianlicensenumber) {
		this.physicianlicensenumber = physicianlicensenumber;
	}
	public String getMedicarenumber() {
		return medicarenumber;
	}
	public void setMedicarenumber(String medicarenumber) {
		this.medicarenumber = medicarenumber;
	}
	public String getNpinumber() {
		return npinumber;
	}
	public void setNpinumber(String npinumber) {
		this.npinumber = npinumber;
	}
	public LicensePhycicalList(String firstname, String middlename, String lastname, String suffix, String degree,
			String physicianlicensestate, String physicianlicensenumber, String medicarenumber, String npinumber) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.suffix = suffix;
		this.degree = degree;
		this.physicianlicensestate = physicianlicensestate;
		this.physicianlicensenumber = physicianlicensenumber;
		this.medicarenumber = medicarenumber;
		this.npinumber = npinumber;
	}
	public LicensePhycicalList() {
		// TODO Auto-generated constructor stub
	}
	

}
