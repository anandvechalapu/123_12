package com.testsdfsdf.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsdfsdf.model.Opportunity;
import com.testsdfsdf.repository.OpportunityRepository;

@Service
public class OpportunityService {

  @Autowired
  private OpportunityRepository opportunityRepository;

  public List<Opportunity> findByAccountId(Long accountId) {
    return opportunityRepository.findByAccountId(accountId);
  }

  public List<Opportunity> findByCreatedDateGreaterThan(LocalDateTime cutoffDate) {
    return opportunityRepository.findByCreatedDateGreaterThan(cutoffDate);
  }

  public void updateStageToCloseLost(Long opportunityId) {
    opportunityRepository.updateStageToCloseLost(opportunityId);
  }

  public void logChangesToStage(Long opportunityId, String oldValue, String newValue, LocalDateTime timestamp) {
    opportunityRepository.logChangesToStage(opportunityId, oldValue, newValue, timestamp);
  }

}