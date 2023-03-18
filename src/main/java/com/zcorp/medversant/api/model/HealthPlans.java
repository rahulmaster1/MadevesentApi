package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "healthPlan")
public class HealthPlans implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "dataHealth", joinColumns = @JoinColumn(name = "health_id") )
	
    @Column(name = "healthData_id")
    private Set<String> healthData= new HashSet<>();
	@ElementCollection(fetch = FetchType.EAGER)

    @CollectionTable(name = "hospitalisData", joinColumns = @JoinColumn(name = "health_id") )

    @Column(name = "hospitalisData_id")
	private Set<String> hospitalis= new HashSet<>();
	@ElementCollection(fetch = FetchType.EAGER)

    @CollectionTable(name = "directorsData", joinColumns = @JoinColumn(name = "health_id") )
    @Column(name = "directorsData_id")
	private Set<String> directors= new HashSet<>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Set<String> getHealthData() {
		return healthData;
	}
	public void setHealthData(Set<String> healthData) {
		this.healthData = healthData;
	}
	public Set<String> getHospitalis() {
		return hospitalis;
	}
	public void setHospitalis(Set<String> hospitalis) {
		this.hospitalis = hospitalis;
	}
	public Set<String> getDirectors() {
		return directors;
	}
	public void setDirectors(Set<String> directors) {
		this.directors = directors;
	}
     
	public HealthPlans(Integer id, Set<String> healthData, Set<String> hospitalis, Set<String> directors) {
		this.id = id;
		this.healthData = healthData;
		this.hospitalis = hospitalis;
		this.directors = directors;
	}
	public HealthPlans() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
