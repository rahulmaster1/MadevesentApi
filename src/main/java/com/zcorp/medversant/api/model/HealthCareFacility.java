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
@Table(name = "HealthCareFacility")
public class HealthCareFacility implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean hospitalPrivileges;
	@ElementCollection
	private  List<HospitalPrivilegesList> hospitalPrivilegesLists;
	private Boolean admittingArragementsSwitch;
	@ElementCollection
	private List<AdmittingArragement> admittingArragements;
	private String admittingArrgumentExplaain;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getHospitalPrivileges() {
		return hospitalPrivileges;
	}
	public void setHospitalPrivileges(Boolean hospitalPrivileges) {
		this.hospitalPrivileges = hospitalPrivileges;
	}
	public List<HospitalPrivilegesList> getHospitalPrivilegesLists() {
		return hospitalPrivilegesLists;
	}
	public void setHospitalPrivilegesLists(List<HospitalPrivilegesList> hospitalPrivilegesLists) {
		this.hospitalPrivilegesLists = hospitalPrivilegesLists;
	}
	public List<AdmittingArragement> getAdmittingArragements() {
		return admittingArragements;
	}
	public void setAdmittingArragements(List<AdmittingArragement> admittingArragements) {
		this.admittingArragements = admittingArragements;
	}
	public String getAdmittingArrgumentExplaain() {
		return admittingArrgumentExplaain;
	}
	public void setAdmittingArrgumentExplaain(String admittingArrgumentExplaain) {
		this.admittingArrgumentExplaain = admittingArrgumentExplaain;
	}
	
	
	public Boolean getAdmittingArragementsSwitch() {
		return admittingArragementsSwitch;
	}
	public void setAdmittingArragementsSwitch(Boolean admittingArragementsSwitch) {
		this.admittingArragementsSwitch = admittingArragementsSwitch;
	}
	public HealthCareFacility(Integer id, Boolean hospitalPrivileges,
			List<HospitalPrivilegesList> hospitalPrivilegesLists, List<AdmittingArragement> admittingArragements,
			String admittingArrgumentExplaain,Boolean admittingArragementsSwitch) {
		this.id = id;
		this.hospitalPrivileges = hospitalPrivileges;
		this.hospitalPrivilegesLists = hospitalPrivilegesLists;
		this.admittingArragements = admittingArragements;
		this.admittingArrgumentExplaain = admittingArrgumentExplaain;
		this.admittingArragementsSwitch=admittingArragementsSwitch;
	}
	public HealthCareFacility() {
	}
	
	
	

}
