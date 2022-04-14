package com.example.asynchronous.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sales_line")
public class SalesLine {
	
	@Id
	private String salesLineId;
	
	private String productId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="salesPersonId")
	private SalesPerson salesPersonId;
	
	private Date salesDate;
	private float salesPrice;
	private String reportingId;
	private float commision;
	public SalesLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesLine(String salesLineId, String productId, SalesPerson salesPersonId, Date salesDate, float salesPrice, String reportingId,
			float commision) {
		super();
		this.salesLineId=salesLineId;
		this.productId = productId;
		this.salesPersonId = salesPersonId;
		this.salesDate = salesDate;
		this.salesPrice = salesPrice;
		this.reportingId = reportingId;
		this.commision = commision;
	}
	public String getSalesLineId() {
		return salesLineId;
	}
	public void setSalesLineId(String salesLineId) {
		this.salesLineId = salesLineId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public SalesPerson getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(SalesPerson salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	public float getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(float salesPrice) {
		this.salesPrice = salesPrice;
	}
	public String getReportingId() {
		return reportingId;
	}
	public void setReportingId(String reportingId) {
		this.reportingId = reportingId;
	}
	public float getCommision() {
		return commision;
	}
	public void setCommision(float commision) {
		this.commision = commision;
	}
	
	
	

}
