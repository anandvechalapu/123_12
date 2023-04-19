package com.testsdfsdf.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testsdfsdf.entity.Opportunity;
import com.testsdfsdf.service.OpportunityService;

@RestController
public class OpportunityController {

  @Autowired
  OpportunityService opportunityService;

  @GetMapping("/opportunity/byAccountId")
  public List<Opportunity> findByAccountId(@RequestParam("accountId") Long accountId) {
    return opportunityService.findByAccountId(accountId);
  }

  @GetMapping("/opportunity/byCreatedDate")
  public List<Opportunity> findByCreatedDateGreaterThanAndStageNot(@RequestParam("createdDate") Date createdDate,
      @RequestParam("stage") String stage) {
    return opportunityService.findByCreatedDateGreaterThanAndStageNot(createdDate, stage);
  }

  @GetMapping("/opportunity/saveAll")
  public List<Opportunity> saveAll(@RequestParam("opportunities") List<Opportunity> opportunities) {
    return opportunityService.saveAll(opportunities);
  }

  @GetMapping("/opportunity/logChanges")
  public void logChanges(@RequestParam("opportunityId") Long opportunityId, @RequestParam("oldValue") String oldValue,
      @RequestParam("newValue") String newValue, @RequestParam("timestamp") Date timestamp) {
    opportunityService.logChanges(opportunityId, oldValue, newValue, timestamp);
  }

}