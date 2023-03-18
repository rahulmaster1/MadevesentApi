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
@Table(name = "Education")
public class Education implements Serializable{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean undergraduteSchool;
	@ElementCollection
	private List<UnderGraduteSchoolList> underGraduteSchoolLists;
	private Boolean professionalEducation;
	@ElementCollection
	private List<GraduteSchoolList> graduteSchoolLists;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getUndergraduteSchool() {
		return undergraduteSchool;
	}
	public void setUndergraduteSchool(Boolean undergraduteSchool) {
		this.undergraduteSchool = undergraduteSchool;
	}
	public List<UnderGraduteSchoolList> getUnderGraduteSchoolLists() {
		return underGraduteSchoolLists;
	}
	public void setUnderGraduteSchoolLists(List<UnderGraduteSchoolList> underGraduteSchoolLists) {
		this.underGraduteSchoolLists = underGraduteSchoolLists;
	}
	public Boolean getProfessionalEducation() {
		return professionalEducation;
	}
	public void setProfessionalEducation(Boolean professionalEducation) {
		this.professionalEducation = professionalEducation;
	}
	public List<GraduteSchoolList> getGraduteSchoolLists() {
		return graduteSchoolLists;
	}
	public void setGraduteSchoolLists(List<GraduteSchoolList> graduteSchoolLists) {
		this.graduteSchoolLists = graduteSchoolLists;
	}
	public Education(Integer id, Boolean undergraduteSchool, List<UnderGraduteSchoolList> underGraduteSchoolLists,
			Boolean professionalEducation, List<GraduteSchoolList> graduteSchoolLists) {
		this.id = id;
		this.undergraduteSchool = undergraduteSchool;
		this.underGraduteSchoolLists = underGraduteSchoolLists;
		this.professionalEducation = professionalEducation;
		this.graduteSchoolLists = graduteSchoolLists;
	}
	public Education() {
		// TODO Auto-generated constructor stub
	}
	
	

}
