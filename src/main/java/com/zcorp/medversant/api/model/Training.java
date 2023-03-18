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
@Table(name = "Trainng")
public class Training implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean trainingProgram;
	@ElementCollection
	private List<TrainingProgramList> trainingProgramLists;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getTrainingProgram() {
		return trainingProgram;
	}
	public void setTrainingProgram(Boolean trainingProgram) {
		this.trainingProgram = trainingProgram;
	}
	public List<TrainingProgramList> getTrainingProgramLists() {
		return trainingProgramLists;
	}
	public void setTrainingProgramLists(List<TrainingProgramList> trainingProgramLists) {
		this.trainingProgramLists = trainingProgramLists;
	}
	public Training(Integer id, Boolean trainingProgram, List<TrainingProgramList> trainingProgramLists) {
		this.id = id;
		this.trainingProgram = trainingProgram;
		this.trainingProgramLists = trainingProgramLists;
	}
	public Training() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
