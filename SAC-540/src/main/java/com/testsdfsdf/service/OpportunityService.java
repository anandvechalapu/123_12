package com.testsdfsdf.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdf.entity.Opportunity;
import com.testsdfsdf.repository.OpportunityRepository;

@Service
public class OpportunityService {

  @Autowired
  OpportunityRepository opportunityRepository;

  public List<Opportunity> findByAccountId(Long accountId) {
    return opportunityRepository.findByAccountId(accountId);
  }

  public List<Opportunity> findByCreatedDateGreaterThanAndStageNot(Date createdDate, String stage) {
    return opportunityRepository.findByCreatedDateGreaterThanAndStageNot(createdDate, stage);
  }

  public List<Opportunity> saveAll(List<Opportunity> opportunities) {
    return opportunityRepository.saveAll(opportunities);
  }

  public void logChanges(Long opportunityId, String oldValue, String newValue, Date timestamp) {
    opportunityRepository.logChanges(opportunityId, oldValue, newValue, timestamp);
  }
}