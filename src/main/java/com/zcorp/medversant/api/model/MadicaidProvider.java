package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class MadicaidProvider implements Serializable {
	
	private String madicaidNumber;
	private String madicaidState;
	public String getMadicaidNumber() {
		return madicaidNumber;
	}
	public void setMadicaidNumber(String madicaidNumber) {
		this.madicaidNumber = madicaidNumber;
	}
	public String getMadicaidState() {
		return madicaidState;
	}
	public void setMadicaidState(String madicaidState) {
		this.madicaidState = madicaidState;
	}
	public MadicaidProvider(String madicaidNumber, String madicaidState) {
		this.madicaidNumber = madicaidNumber;
		this.madicaidState = madicaidState;
	}
	public MadicaidProvider() {
	}
	
	

}
