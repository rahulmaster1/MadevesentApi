package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "workhistory_employmentGep")
public class WorkHistoryEmploymentGap implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean professionalSchool;
	private String startDate;
	private String endDate;
	private Boolean present;
	private String detailExplained;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getProfessionalSchool() {
		return professionalSchool;
	}
	public void setProfessionalSchool(Boolean professionalSchool) {
		this.professionalSchool = professionalSchool;
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
	public Boolean getPresent() {
		return present;
	}
	public void setPresent(Boolean present) {
		this.present = present;
	}
	public String getDetailExplained() {
		return detailExplained;
	}
	public void setDetailExplained(String detailExplained) {
		this.detailExplained = detailExplained;
	}
	public WorkHistoryEmploymentGap(Integer id, Boolean professionalSchool, String startDate, String endDate,
			Boolean present, String detailExplained) {
		this.id = id;
		this.professionalSchool = professionalSchool;
		this.startDate = startDate;
		this.endDate = endDate;
		this.present = present;
		this.detailExplained = detailExplained;
	}
	public WorkHistoryEmploymentGap() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
