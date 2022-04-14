package com.example.asynchronous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asynchronous.model.CommissionRules;
import com.example.asynchronous.model.SalesPerson;

public interface CommissionRulesRepository extends JpaRepository<CommissionRules, String>{
 

}
