package com.zcorp.medversant.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PracticeInfoUniqueCircu")
public class PracticeInfoUniqueCircu implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String explainCircu;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExplainCircu() {
		return explainCircu;
	}
	public void setExplainCircu(String explainCircu) {
		this.explainCircu = explainCircu;
	}
	public PracticeInfoUniqueCircu(Integer id, String explainCircu) {
		this.id = id;
		this.explainCircu = explainCircu;
	}
	public PracticeInfoUniqueCircu() {
		// TODO Auto-generated constructor stub
	}
	

}
