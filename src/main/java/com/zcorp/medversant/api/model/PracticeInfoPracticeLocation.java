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
@Table(name = "PracticeInformation_PracticeLocation")
public class PracticeInfoPracticeLocation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private Boolean boardExamSwith;
	@ElementCollection
	private List<BoardExamSwitchList> boardExamSwitchLists;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getBoardExamSwith() {
		return boardExamSwith;
	}
	public void setBoardExamSwith(Boolean boardExamSwith) {
		this.boardExamSwith = boardExamSwith;
	}
	public List<BoardExamSwitchList> getBoardExamSwitchLists() {
		return boardExamSwitchLists;
	}
	public void setBoardExamSwitchLists(List<BoardExamSwitchList> boardExamSwitchLists) {
		this.boardExamSwitchLists = boardExamSwitchLists;
	}
	public PracticeInfoPracticeLocation(Integer id, Boolean boardExamSwith,
			List<BoardExamSwitchList> boardExamSwitchLists) {
		this.id = id;
		this.boardExamSwith = boardExamSwith;
		this.boardExamSwitchLists = boardExamSwitchLists;
	}
	public PracticeInfoPracticeLocation() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
