package com.verifone.service;

import java.util.List;

import com.verifone.model.SimCard;

public interface SimCardService{
	
	SimCard addNew(SimCard simcard);
	
	public List<SimCard> getAllDetails();
	
	public String deleteSim(long id);
	
//	public List<SimCard> getRenewDetails();
	

}
