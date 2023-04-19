package com.testsdfsdf.service;

import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdf.model.Opportunity;
import com.testsdfsdf.repository.OpportunityRepository;

@Service
public class OpportunityService {
	
	@Autowired
	private OpportunityRepository opportunityRepository;
	
	public List<Opportunity> findOpportunitiesToUpdate() {
		return opportunityRepository.findOpportunitiesToUpdate();
	}
	
	public void updateOpportunityStage() {
		opportunityRepository.updateOpportunityStage();
	}
	
	public List<Opportunity> findOpportunitiesByAccountId(Long accountId) {
		return opportunityRepository.findOpportunitiesByAccountId(accountId);
	}
	
	public List<Opportunity> findOpportunitiesToUpdateByAccountId(Long accountId) {
		return opportunityRepository.findOpportunitiesToUpdateByAccountId(accountId);
	}
	
	public void updateOpportunityStageByAccountId(Long accountId) {
		opportunityRepository.updateOpportunityStageByAccountId(accountId);
	}
	
	public List<Opportunity> findOpportunitiesByStage(String stage) {
		return opportunityRepository.findOpportunitiesByStage(stage);
	}
	
	public List<Opportunity> findOpportunitiesToUpdateByStage(String stage) {
		return opportunityRepository.findOpportunitiesToUpdateByStage(stage);
	}
	
	public void updateOpportunityStageByStage(String stage) {
		opportunityRepository.updateOpportunityStageByStage(stage);
	}
	
	public void logChanges(String oldStage, String newStage, Date dateTime) {
		opportunityRepository.logChanges(oldStage, newStage, dateTime);
	}
	
}