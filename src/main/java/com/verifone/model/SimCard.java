package com.verifone.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SimCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long sim_card_number;
	private long mobile_number;
	private String status;
	private Date expiry_date;
	private String state_of_registration;
	private String kyc;
	private String telecom_provide;
	private String full_name;
	public long getSim_card_number() {
		return sim_card_number;
	}
	public void setSim_card_number(long sim_card_number) {
		this.sim_card_number = sim_card_number;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getState_of_registration() {
		return state_of_registration;
	}
	public void setState_of_registration(String state_of_registration) {
		this.state_of_registration = state_of_registration;
	}
	public String getKyc() {
		return kyc;
	}
	public void setKyc(String kyc) {
		this.kyc = kyc;
	}
	public String getTelecom_provide() {
		return telecom_provide;
	}
	public void setTelecom_provide(String telecom_provide) {
		this.telecom_provide = telecom_provide;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
}
