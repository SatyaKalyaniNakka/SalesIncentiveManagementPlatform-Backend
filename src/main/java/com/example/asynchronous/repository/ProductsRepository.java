package com.example.asynchronous.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.asynchronous.model.Products;

public interface ProductsRepository extends JpaRepository<Products, String>{

	@Query("select p.productType from Products p where p.productId =:productId")
	public String getProductType(@Param("productId") String productId);


}
