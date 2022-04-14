package com.example.asynchronous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asynchronous.model.SalesLine;


public interface SalesLineRepository extends JpaRepository<SalesLine, String>{

}
