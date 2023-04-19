package com.testsdfsdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
  List<Opportunity> findByAccountId(Long accountId);
  List<Opportunity> findByCreatedDateGreaterThanAndStageNot(Date createdDate, String stage);
  List<Opportunity> saveAll(List<Opportunity> opportunities);
  void logChanges(Long opportunityId, String oldValue, String newValue, Date timestamp);
}