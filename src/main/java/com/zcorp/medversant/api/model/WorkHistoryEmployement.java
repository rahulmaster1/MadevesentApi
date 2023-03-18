package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "WorkHistory_emplye")
public class WorkHistoryEmployement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean educationTraining;
	@ElementCollection
	private List<EducationTrainingList> educationTrainingLists;
	
	private Boolean licencePhycical;
	@ElementCollection
	private List<LicensePhycicalList> licensePhycicalLists;
	
	private String explainProfessionLiberty;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEducationTraining() {
		return educationTraining;
	}

	public void setEducationTraining(Boolean educationTraining) {
		this.educationTraining = educationTraining;
	}

	public List<EducationTrainingList> getEducationTrainingLists() {
		return educationTrainingLists;
	}

	public void setEducationTrainingLists(List<EducationTrainingList> educationTrainingLists) {
		this.educationTrainingLists = educationTrainingLists;
	}

	public Boolean getLicencePhycical() {
		return licencePhycical;
	}

	public void setLicencePhycical(Boolean licencePhycical) {
		this.licencePhycical = licencePhycical;
	}

	public List<LicensePhycicalList> getLicensePhycicalLists() {
		return licensePhycicalLists;
	}

	public void setLicensePhycicalLists(List<LicensePhycicalList> licensePhycicalLists) {
		this.licensePhycicalLists = licensePhycicalLists;
	}

	public String getExplainProfessionLiberty() {
		return explainProfessionLiberty;
	}

	public void setExplainProfessionLiberty(String explainProfessionLiberty) {
		this.explainProfessionLiberty = explainProfessionLiberty;
	}

	public WorkHistoryEmployement(Integer id, Boolean educationTraining,
			List<EducationTrainingList> educationTrainingLists, Boolean licencePhycical,
			List<LicensePhycicalList> licensePhycicalLists, String explainProfessionLiberty) {
		this.id = id;
		this.educationTraining = educationTraining;
		this.educationTrainingLists = educationTrainingLists;
		this.licencePhycical = licencePhycical;
		this.licensePhycicalLists = licensePhycicalLists;
		this.explainProfessionLiberty = explainProfessionLiberty;
	}

	public WorkHistoryEmployement() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
