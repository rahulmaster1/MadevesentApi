package com.zcorp.medversant.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import lombok.Data;
@Data
@Embeddable
public class SpecialistObject implements Serializable {
	
	private String ranking;
	private String speciality;
	private String ppo_directory;
	private String pos_directory;
	private Boolean provide_directory;
	private Boolean hmo_directory;
	private Boolean certified;
	private Boolean eligible;
	private String certified_board;
	private String address_line;
	private String address_line2;
	private String city;
	private String state;
	private String zip_code;
	private String board_certification_number;
	private String mobile;
	private String ext;
	private String fax_num;
	private String certification_expired_date;
	private String intial_certification_date;
	private Boolean does_not_expired;
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getPpo_directory() {
		return ppo_directory;
	}
	public void setPpo_directory(String ppo_directory) {
		this.ppo_directory = ppo_directory;
	}
	public String getPos_directory() {
		return pos_directory;
	}
	public void setPos_directory(String pos_directory) {
		this.pos_directory = pos_directory;
	}
	public Boolean getProvide_directory() {
		return provide_directory;
	}
	public void setProvide_directory(Boolean provide_directory) {
		this.provide_directory = provide_directory;
	}
	public Boolean getHmo_directory() {
		return hmo_directory;
	}
	public void setHmo_directory(Boolean hmo_directory) {
		this.hmo_directory = hmo_directory;
	}
	public Boolean getCertified() {
		return certified;
	}
	public void setCertified(Boolean certified) {
		this.certified = certified;
	}
	public Boolean getEligible() {
		return eligible;
	}
	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}
	public String getCertified_board() {
		return certified_board;
	}
	public void setCertified_board(String certified_board) {
		this.certified_board = certified_board;
	}
	public String getAddress_line() {
		return address_line;
	}
	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getBoard_certification_number() {
		return board_certification_number;
	}
	public void setBoard_certification_number(String board_certification_number) {
		this.board_certification_number = board_certification_number;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getFax_num() {
		return fax_num;
	}
	public void setFax_num(String fax_num) {
		this.fax_num = fax_num;
	}
	public String getCertification_expired_date() {
		return certification_expired_date;
	}
	public void setCertification_expired_date(String certification_expired_date) {
		this.certification_expired_date = certification_expired_date;
	}
	public String getIntial_certification_date() {
		return intial_certification_date;
	}
	public void setIntial_certification_date(String intial_certification_date) {
		this.intial_certification_date = intial_certification_date;
	}
	public Boolean getDoes_not_expired() {
		return does_not_expired;
	}
	public void setDoes_not_expired(Boolean does_not_expired) {
		this.does_not_expired = does_not_expired;
	}
	
	public SpecialistObject(String ranking, String speciality, String ppo_directory, String pos_directory,
			Boolean provide_directory, Boolean hmo_directory, Boolean certified, Boolean eligible,
			String certified_board, String address_line, String address_line2, String city, String state,
			String zip_code, String board_certification_number, String mobile, String ext, String fax_num,
			String certification_expired_date, String intial_certification_date, Boolean does_not_expired) {
		this.ranking = ranking;
		this.speciality = speciality;
		this.ppo_directory = ppo_directory;
		this.pos_directory = pos_directory;
		this.provide_directory = provide_directory;
		this.hmo_directory = hmo_directory;
		this.certified = certified;
		this.eligible = eligible;
		this.certified_board = certified_board;
		this.address_line = address_line;
		this.address_line2 = address_line2;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.board_certification_number = board_certification_number;
		this.mobile = mobile;
		this.ext = ext;
		this.fax_num = fax_num;
		this.certification_expired_date = certification_expired_date;
		this.intial_certification_date = intial_certification_date;
		this.does_not_expired = does_not_expired;
	}
	public SpecialistObject() {
		// TODO Auto-generated constructor stub
	}
	

}
