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
@Table(name = "specialties")
public class Specialties implements  Serializable {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ElementCollection
	private List<SpecialistObject> specialist_object;
	@ElementCollection

	private List<AddRecertificationDate> addRece_date;
	private Boolean boardExam;
	@ElementCollection

	private List<BoardExamList> boardExamList;
	private String otherArea;
	public String getOtherArea() {
		return otherArea;
	}
	public void setOtherArea(String otherArea) {
		this.otherArea = otherArea;
	}
	public Boolean getBoardExam() {
		return boardExam;
	}
	public void setBoardExam(Boolean boardExam) {
		this.boardExam = boardExam;
	}
	public List<BoardExamList> getBoardExamList() {
		return boardExamList;
	}
	public void setBoardExamList(List<BoardExamList> boardExamList) {
		this.boardExamList = boardExamList;
	}
	public List<AddRecertificationDate> getAddRece_date() {
		return addRece_date;
	}
	public void setAddRece_date(List<AddRecertificationDate> addRece_date) {
		this.addRece_date = addRece_date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<SpecialistObject> getSpecialist_object() {
		return specialist_object;
	}
	public void setSpecialist_object(List<SpecialistObject> specialist_object) {
		this.specialist_object = specialist_object;
	}
	public Specialties(Integer id, List<SpecialistObject> specialist_object, List<AddRecertificationDate> addRece_date,
			Boolean boardExam, List<BoardExamList> boardExamList, String otherArea) {
		this.id = id;
		this.specialist_object = specialist_object;
		this.addRece_date = addRece_date;
		this.boardExam = boardExam;
		this.boardExamList = boardExamList;
		this.otherArea=otherArea;
	}
	public Specialties() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	


	
	

}
