package com.example.asynchronous.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.asynchronous.model.SalesPerson;

@Repository
public interface SalesPersonRepository extends CrudRepository<SalesPerson,Long>  {
	String deleteBySalesPersonId(String salesPersonId);
	
	@Query("select sp.twoWheelerSold from SalesPerson sp where sp.salesPersonId = :salesPersonId")
	public Integer getTwoWheelerSold(@Param("salesPersonId") String salesPersonId);
	
	@Query("select sp.threeWheelerSold from SalesPerson sp where sp.salesPersonId = :salesPersonId")
	public Integer getThreeWheelerSold(@Param("salesPersonId") String salesPersonId);

	@Query("select sp.fourWheelerSold from SalesPerson sp where sp.salesPersonId = :salesPersonId")
	public Integer getFourWheelerSold(@Param("salesPersonId") String salesPersonId);
	
	@Query("select sp.commercialSold from SalesPerson sp where sp.salesPersonId = :salesPersonId")
	public Integer getCommercialSold(@Param("salesPersonId") String salesPersonId);
	
	@Modifying(flushAutomatically = true)
	@Transactional
	@Query("update SalesPerson sp set sp.twoWheelerSold = :twoWheelerSold, sp.threeWheelerSold = :threeWheelerSold, sp.fourWheelerSold = :fourWheelerSold, sp.commercialSold= :commercialSold where sp.salesPersonId =:salesPersonId")
	public void updateVehicleDetails(
			@Param("twoWheelerSold") int twoWheelerSold,
			@Param("threeWheelerSold") int threeWheelerSold,
			@Param("fourWheelerSold") int fourWheelerSold,
			@Param("commercialSold") int commercialSold,
			@Param("salesPersonId") String salesPersonId
			);
	
	@Modifying(flushAutomatically = true)
	@Transactional
	@Query("update SalesPerson sp set sp.uptodateCommission = :uptodateCommission where sp.salesPersonId = :salesPersonId")
	public void updateCommission(@Param("uptodateCommission") float uptodateCommission,
			@Param("salesPersonId") String salesPerson);
	
	@Query("select sp.uptodateCommission from SalesPerson sp where sp.salesPersonId = :salesPersonId")
	public float getUptodateCommission(@Param("salesPersonId") String salesPersonId);
	

}