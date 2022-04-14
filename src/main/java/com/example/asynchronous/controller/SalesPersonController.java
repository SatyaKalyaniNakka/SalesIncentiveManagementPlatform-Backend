package com.example.asynchronous.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.asynchronous.model.SalesPerson;
import com.example.asynchronous.service.SalesPersonService;

@RestController
public class SalesPersonController {
	@Autowired
	SalesPersonService salesPersonService;
	
	@PostMapping("/addSalesPerson")
	public SalesPerson saveUser(@RequestBody SalesPerson salesPerson ) {
		
		salesPersonService.addUser(salesPerson);
		
		return salesPerson;
		
	}
	
	@DeleteMapping("/deleteSalesPerson/{salesPersonId}")
	public String deleteEmployee(@PathVariable (value = "salesPersonId") String salesPersonId) {
	
		this.salesPersonService.deleteSalesPersonById(salesPersonId);
		return "deleted Successfully";
	}
}