package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MadicareProvider implements Serializable {
	
	private String medicareNumber;
	private String medicareState;
	public String getMedicareNumber() {
		return medicareNumber;
	}
	public void setMedicareNumber(String medicareNumber) {
		this.medicareNumber = medicareNumber;
	}
	public String getMedicareState() {
		return medicareState;
	}
	public void setMedicareState(String medicareState) {
		this.medicareState = medicareState;
	}
	public MadicareProvider(String medicareNumber, String medicareState) {
		this.medicareNumber = medicareNumber;
		this.medicareState = medicareState;
	}
	public MadicareProvider() {
	}
	
	
	
	

}
