package com.verifone.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verifone.model.SimCard;
import com.verifone.repo.SimCardRepo;

@Service
public class SimCardServiceImpl implements SimCardService{

	@Autowired
	private SimCardRepo simRepo;
	
	@Override
	public SimCard addNew(SimCard simcard) {
		System.out.println(simcard);
		simRepo.save(simcard);
		return simcard;
	}
	@Override
	public List<SimCard> getAllDetails() {
		return simRepo.findAll();
	}
	@Override
	public String deleteSim(long id)
	{
		SimCard sim = simRepo.getById(id);
		simRepo.delete(sim);
		return"Success";
	}
		

//	@Override
//	public List<SimCard> getRenewDetails() {
//		List<SimCard> users = simRepo.findAll();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		Calendar c = Calendar.getInstance();
//		c.setTime(new java.util.Date()); // Using today's date
//		c.add(Calendar.DATE, 30); // Adding 5 days
//		String output = sdf.format(c.getTime());
//		System.out.println(output);
//		
//		for(int i=0;i<users.size();i++) {
//			SimCard s= users.get(i);
//			if(sdf.format(s.getExpiry_date()).after(c) | sdf.format(s.getExpiry_date()).equals(c) ) {
//				
//			}
//		}
//		
//		return null;
//	}

}
