package com.example.asynchronous.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.asynchronous.model.SalesPerson;
import com.example.asynchronous.repository.SalesPersonRepository;

@Service
public class SalesPersonService {
	
	@Autowired
	SalesPersonRepository salesPersonRepository;
	
	public void addUser(SalesPerson salesPerson) {
		this.salesPersonRepository.save(salesPerson);
	}

	@Transactional
	public void deleteSalesPersonById(String salesPersonId) {
		this.salesPersonRepository.deleteBySalesPersonId(salesPersonId);
		
	}

}
