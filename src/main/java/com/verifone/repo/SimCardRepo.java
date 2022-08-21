package com.verifone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verifone.model.SimCard;

@Repository
public interface SimCardRepo extends JpaRepository<SimCard,Long> {
	

}
