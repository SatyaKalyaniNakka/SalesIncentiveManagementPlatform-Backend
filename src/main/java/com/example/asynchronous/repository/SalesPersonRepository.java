package com.example.asynchronous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asynchronous.model.SalesPerson;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, String>{

}
