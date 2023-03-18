package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "workHistoryProfessionalOrag")
public class WorkHistoryProfessionalOragnization implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean professionalOragnizationSwith;
	private String orgnizationName;
	private String effectiveDate;
	private String terminateDate;
	private Boolean persent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getProfessionalOragnizationSwith() {
		return professionalOragnizationSwith;
	}
	public void setProfessionalOragnizationSwith(Boolean professionalOragnizationSwith) {
		this.professionalOragnizationSwith = professionalOragnizationSwith;
	}
	public String getOrgnizationName() {
		return orgnizationName;
	}
	public void setOrgnizationName(String orgnizationName) {
		this.orgnizationName = orgnizationName;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getTerminateDate() {
		return terminateDate;
	}
	public void setTerminateDate(String terminateDate) {
		this.terminateDate = terminateDate;
	}
	public Boolean getPersent() {
		return persent;
	}
	public void setPersent(Boolean persent) {
		this.persent = persent;
	}
	public WorkHistoryProfessionalOragnization(Integer id, Boolean professionalOragnizationSwith,
			String orgnizationName, String effectiveDate, String terminateDate, Boolean persent) {
		this.id = id;
		this.professionalOragnizationSwith = professionalOragnizationSwith;
		this.orgnizationName = orgnizationName;
		this.effectiveDate = effectiveDate;
		this.terminateDate = terminateDate;
		this.persent = persent;
	}
	public WorkHistoryProfessionalOragnization() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
