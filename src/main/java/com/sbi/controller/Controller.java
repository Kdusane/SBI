package com.sbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.model.Details;
import com.sbi.repository.SBIRepository;

@RestController
@RequestMapping("/api/v1/")
public class Controller {
	@Autowired
	private SBIRepository sbirepository;
	
	@GetMapping("/personaldetails")

	public List<Details> getAllDetails(){
		return sbirepository.findAll();
	}
	
}
