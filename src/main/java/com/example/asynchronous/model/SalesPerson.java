package com.example.asynchronous.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="direct_sales_person")
public class SalesPerson {
	
	@Id
	private String salesPersonId;
	
	private String password;
	private String name;
	private String location;
	private int quota;
	private int level;
	private String reportingId;
	private int twoWheelerSold;
	private int threeWheelerSold;
	private int fourWheelerSold;
	private int commercialSold;
	private int totalSales;
	private float uptodateCommission;
	private String role = "sales";
	

	
	public SalesPerson(String salesPersonId, String password, String name, String location, int quota, int level,
			String reportingId, int twoWheelerSold, int threeWheelerSold, int fourWheelerSold, int commercialSold,
			int totalSales, float uptodateCommission, String role) {
		super();
		this.salesPersonId = salesPersonId;
		this.password = password;
		this.name = name;
		this.location = location;
		this.quota = quota;
		this.level = level;
		this.reportingId = reportingId;
		this.twoWheelerSold = twoWheelerSold;
		this.threeWheelerSold = threeWheelerSold;
		this.fourWheelerSold = fourWheelerSold;
		this.commercialSold = commercialSold;
		this.totalSales = totalSales;
		this.uptodateCommission = uptodateCommission;
		this.role = role;
	}
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public String getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getQuota() {
		return quota;
	}
	public void setQuota(int quota) {
		this.quota = quota;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getReportingId() {
		return reportingId;
	}
	public void setReportingId(String reportingId) {
		this.reportingId = reportingId;
	}
	public int getTwoWheelerSold() {
		return twoWheelerSold;
	}
	public void setTwoWheelerSold(int twoWheelerSold) {
		this.twoWheelerSold = twoWheelerSold;
	}
	public int getThreeWheelerSold() {
		return threeWheelerSold;
	}
	public void setThreeWheelerSold(int threeWheelerSold) {
		this.threeWheelerSold = threeWheelerSold;
	}
	public int getFourWheelerSold() {
		return fourWheelerSold;
	}
	public void setFourWheelerSold(int fourWheelerSold) {
		this.fourWheelerSold = fourWheelerSold;
	}
	public int getCommercialSold() {
		return commercialSold;
	}
	public void setCommercialSold(int commercialSold) {
		this.commercialSold = commercialSold;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public float getUptodateCommission() {
		return uptodateCommission;
	}
	public void setUptodateCommission(float uptodateCommission) {
		this.uptodateCommission = uptodateCommission;
	}
	


}
