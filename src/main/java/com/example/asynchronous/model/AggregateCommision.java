package com.example.asynchronous.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agregate_commission")
public class AggregateCommision {
	@Id
	private String id;
	private String salesPersonId;
	private String month;
	private float commission;
	
	public AggregateCommision() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AggregateCommision(String salesPersonId, String month, float commission) {
		super();
		this.salesPersonId = salesPersonId;
		this.month = month;
		this.commission = commission;
	}
	public String getSalesPersonId() {
		return salesPersonId;
	}
	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	
}
