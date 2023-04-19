package com.testsdfsdf.controller;
 
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdf.model.Opportunity;
import com.testsdfsdf.service.OpportunityService;

@RestController
public class OpportunityController {
	
	@Autowired
	private OpportunityService opportunityService;
	
	@GetMapping("/opportunities")
	public List<Opportunity> findOpportunitiesToUpdate() {
		return opportunityService.findOpportunitiesToUpdate();
	}
	
	@PostMapping("/opportunities")
	public void updateOpportunityStage() {
		opportunityService.updateOpportunityStage();
	}
	
	@GetMapping("/opportunities/account/{accountId}")
	public List<Opportunity> findOpportunitiesByAccountId(@PathVariable Long accountId) {
		return opportunityService.findOpportunitiesByAccountId(accountId);
	}
	
	@GetMapping("/opportunities/account/{accountId}/update")
	public List<Opportunity> findOpportunitiesToUpdateByAccountId(@PathVariable Long accountId) {
		return opportunityService.findOpportunitiesToUpdateByAccountId(accountId);
	}
	
	@PutMapping("/opportunities/account/{accountId}")
	public void updateOpportunityStageByAccountId(@PathVariable Long accountId) {
		opportunityService.updateOpportunityStageByAccountId(accountId);
	}
	
	@GetMapping("/opportunities/stage")
	public List<Opportunity> findOpportunitiesByStage(@RequestParam String stage) {
		return opportunityService.findOpportunitiesByStage(stage);
	}
	
	@GetMapping("/opportunities/stage/update")
	public List<Opportunity> findOpportunitiesToUpdateByStage(@RequestParam String stage) {
		return opportunityService.findOpportunitiesToUpdateByStage(stage);
	}
	
	@PutMapping("/opportunities/stage")
	public void updateOpportunityStageByStage(@RequestParam String stage) {
		opportunityService.updateOpportunityStageByStage(stage);
	}
	
	@PostMapping("/opportunities/log")
	public void logChanges(@RequestParam String oldStage, @RequestParam String newStage, @RequestParam Date dateTime) {
		opportunityService.logChanges(oldStage, newStage, dateTime);
	}
	
}