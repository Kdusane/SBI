package com.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.model.Details;
@Repository

public interface SBIRepository extends JpaRepository<Details, Long> {
	
	

}
