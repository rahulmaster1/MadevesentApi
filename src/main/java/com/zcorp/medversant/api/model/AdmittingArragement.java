package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class AdmittingArragement implements Serializable{
	
	private String nameOfAdmitting;
	private String facLocatin;
	private String facName;
	private String officeAddressline1;
	private String officeAddressline2;
	private String city;
	private String zipCode;
	private String admittingExplain;
	public String getNameOfAdmitting() {
		return nameOfAdmitting;
	}
	public void setNameOfAdmitting(String nameOfAdmitting) {
		this.nameOfAdmitting = nameOfAdmitting;
	}
	public String getFacLocatin() {
		return facLocatin;
	}
	public void setFacLocatin(String facLocatin) {
		this.facLocatin = facLocatin;
	}
	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public String getOfficeAddressline1() {
		return officeAddressline1;
	}
	public void setOfficeAddressline1(String officeAddressline1) {
		this.officeAddressline1 = officeAddressline1;
	}
	public String getOfficeAddressline2() {
		return officeAddressline2;
	}
	public void setOfficeAddressline2(String officeAddressline2) {
		this.officeAddressline2 = officeAddressline2;
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
	public String getAdmittingExplain() {
		return admittingExplain;
	}
	public void setAdmittingExplain(String admittingExplain) {
		this.admittingExplain = admittingExplain;
	}
	public AdmittingArragement(String nameOfAdmitting, String facLocatin, String facName, String officeAddressline1,
			String officeAddressline2, String city, String zipCode, String admittingExplain) {
		this.nameOfAdmitting = nameOfAdmitting;
		this.facLocatin = facLocatin;
		this.facName = facName;
		this.officeAddressline1 = officeAddressline1;
		this.officeAddressline2 = officeAddressline2;
		this.city = city;
		this.zipCode = zipCode;
		this.admittingExplain = admittingExplain;
	}
	public AdmittingArragement() {
		// TODO Auto-generated constructor stub
	}
	

}
