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
@Table(name = "TeachingApp")
public class TeachingAppointment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Boolean teachingApp;
	@ElementCollection
	private List<TeachingAppointmentList> teachingAppointmentLists;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getTeachingApp() {
		return teachingApp;
	}
	public void setTeachingApp(Boolean teachingApp) {
		this.teachingApp = teachingApp;
	}
	public List<TeachingAppointmentList> getTeachingAppointmentLists() {
		return teachingAppointmentLists;
	}
	public void setTeachingAppointmentLists(List<TeachingAppointmentList> teachingAppointmentLists) {
		this.teachingAppointmentLists = teachingAppointmentLists;
	}
	public TeachingAppointment(Integer id, Boolean teachingApp,
			List<TeachingAppointmentList> teachingAppointmentLists) {
		this.id = id;
		this.teachingApp = teachingApp;
		this.teachingAppointmentLists = teachingAppointmentLists;
	}
	public TeachingAppointment() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
