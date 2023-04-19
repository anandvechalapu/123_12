package com.testsdfsdf.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Opportunity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long accountId;
	private String stage;
	private Date createdDate;
	private String oldStage;
	private String newStage;
	private Date dateTime;
	
	public Opportunity() {}
	
	public Opportunity(Long accountId, String stage, Date createdDate) {
		this.accountId = accountId;
		this.stage = stage;
		this.createdDate = createdDate;
	}
	
	public Opportunity(String oldStage, String newStage, Date dateTime) {
		this.oldStage = oldStage;
		this.newStage = newStage;
		this.dateTime = dateTime;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAccountId() {
		return accountId;
	}
	
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	public String getStage() {
		return stage;
	}
	
	public void setStage(String stage) {
		this.stage = stage;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getOldStage() {
		return oldStage;
	}
	
	public void setOldStage(String oldStage) {
		this.oldStage = oldStage;
	}
	
	public String getNewStage() {
		return newStage;
	}
	
	public void setNewStage(String newStage) {
		this.newStage = newStage;
	}
	
	public Date getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}