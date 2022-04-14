package com.example.asynchronous.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.asynchronous.model.CommissionModel;

@Repository
public interface CommissionModelRepository extends JpaRepository<CommissionModel, String>{

}
