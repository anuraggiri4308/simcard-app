package com.verifone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verifone.model.SimCard;
import com.verifone.repo.SimCardRepo;
import com.verifone.service.SimCardService;
import com.verifone.service.SimCardServiceImpl;

@RestController
public class SimCardController {
	
	@Autowired
	private SimCardService simService;
	@Autowired
	private SimCardRepo simCardRepo;
	
	
	
	@GetMapping("/")
	public ResponseEntity<?> homePage(){
		return new ResponseEntity<String>(HttpStatus.OK);
	}
//	post data
	@PostMapping("/add")
	public ResponseEntity<SimCard> addNewSim(@RequestBody SimCard simCard){
		SimCard addedSim = simService.addNew(simCard);
		System.out.println(addedSim);
		return new ResponseEntity<SimCard>(addedSim,HttpStatus.CREATED);
	}
	
//	get all data
	@GetMapping("/listall")
		public List<SimCard> getDetails(){
			return simService.getAllDetails();
		}
	
	//update data
	@PutMapping("/update/{id}")
	public SimCard updateSim(@PathVariable(value = "id") long id,
	  @RequestBody SimCard simDetails){
	     SimCard sim = simCardRepo.findById(id).get();
	  
	     sim.setFull_name(simDetails.getFull_name());
	     
	     final SimCard updatedSimCard = simCardRepo.save(sim);
	     return updatedSimCard;
	}
//	delete data
	@DeleteMapping("/delete/{id}")
	public String deleteSim(@PathVariable long id) {
		return simService.deleteSim(id);
	}
	
	//get sim details that are expiring in 30 days
//	@GetMapping("/to-renew")
//	public List<SimCard> getDetails30(){
//		return simService.getRenewDetails();
//	}
	
}
