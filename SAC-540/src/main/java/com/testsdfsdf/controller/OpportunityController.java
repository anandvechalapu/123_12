package com.testsdfsdf.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdf.model.Opportunity;
import com.testsdfsdf.service.OpportunityService;

@RestController
public class OpportunityController {
  @Autowired
  private OpportunityService opportunityService;

  @GetMapping("/opportunities/byAccountId")
  public List<Opportunity> getOpportunitiesByAccountId(@RequestParam Long accountId) {
    return opportunityService.findByAccountId(accountId);
  }

  @GetMapping("/opportunities/byCreatedDate")
  public List<Opportunity> getOpportunitiesByCreatedDate(@RequestParam LocalDateTime cutoffDate) {
    return opportunityService.findByCreatedDateGreaterThan(cutoffDate);
  }

  @PostMapping("/opportunities/updateStageToCloseLost")
  public void updateStageToCloseLost(@RequestParam Long opportunityId) {
    opportunityService.updateStageToCloseLost(opportunityId);
  }

  @PostMapping("/opportunities/logChangesToStage")
  public void logChangesToStage(@RequestParam Long opportunityId, @RequestParam String oldValue, 
    @RequestParam String newValue, @RequestParam LocalDateTime timestamp) {
    opportunityService.logChangesToStage(opportunityId, oldValue, newValue, timestamp);
  }

}