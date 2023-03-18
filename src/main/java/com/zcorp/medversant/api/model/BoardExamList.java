package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class BoardExamList implements Serializable {
	
	private String boardExamDate;
	private String certifyingBoard;
	private String reasonFailure;
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
	public String getReasonFailure() {
		return reasonFailure;
	}
	public void setReasonFailure(String reasonFailure) {
		this.reasonFailure = reasonFailure;
	}
	public BoardExamList(String boardExamDate, String certifyingBoard, String reasonFailure) {
		this.boardExamDate = boardExamDate;
		this.certifyingBoard = certifyingBoard;
		this.reasonFailure = reasonFailure;
	}
	public BoardExamList() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
