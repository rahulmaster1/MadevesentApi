package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class AddRecertificationDate implements Serializable {
	
	private String  recertificationDate;

	public String getRecertificationDate() {
		return recertificationDate;
	}

	public void setRecertificationDate(String recertificationDate) {
		this.recertificationDate = recertificationDate;
	}

	public AddRecertificationDate(String recertificationDate) {
		this.recertificationDate = recertificationDate;
	}

	public AddRecertificationDate() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
