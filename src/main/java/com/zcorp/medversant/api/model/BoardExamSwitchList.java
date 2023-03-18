package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class BoardExamSwitchList implements Serializable{
	
	private String boardExamDate;
	private String certifyingBoard;
	private String reasonForFailure;
	public String getBoardExamDate() {
		return boardExamDate;
	}
	public void setBoardExamDate(String boardExamDate) {
		this.boardExamDate = boardExamDate;
	}
	public String getCertifyingBoard() {
		return certifyingBoard;
	}
	public void setCertifyingBoard(String certifyingBoard) {
		this.certifyingBoard = certifyingBoard;
	}
	public String getReasonForFailure() {
		return reasonForFailure;
	}
	public void setReasonForFailure(String reasonForFailure) {
		this.reasonForFailure = reasonForFailure;
	}
	public BoardExamSwitchList(String boardExamDate, String certifyingBoard, String reasonForFailure) {
		this.boardExamDate = boardExamDate;
		this.certifyingBoard = certifyingBoard;
		this.reasonForFailure = reasonForFailure;
	}
	public BoardExamSwitchList() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
