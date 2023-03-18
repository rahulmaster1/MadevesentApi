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
@Table(name = "OthersIdsCetificate")
public class OthersIdsCertificate implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ElementCollection
	private List<MadicareProvider> medicareProvider;
	
	@ElementCollection
	private List<MadicaidProvider> medicaidProvider;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<MadicareProvider> getMedicareProvider() {
		return medicareProvider;
	}
	public void setMedicareProvider(List<MadicareProvider> medicareProvider) {
		this.medicareProvider = medicareProvider;
	}
	
	public List<MadicaidProvider> getMedicaidProvider() {
		return medicaidProvider;
	}
	public void setMedicaidProvider(List<MadicaidProvider> medicaidProvider) {
		this.medicaidProvider = medicaidProvider;
	}
	public OthersIdsCertificate(Integer id, List<MadicareProvider> medicareProvider, List<MadicaidProvider> medicaidProvider) {
		this.id = id;
		this.medicareProvider = medicareProvider;
		this.medicaidProvider = medicaidProvider;

	}
	public OthersIdsCertificate() {
	}
	
	
	

}
