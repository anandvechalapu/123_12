package com.testsdfsdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testsdfsdf.model.Opportunity;

@Repository
public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
    
    // Method to find all opportunities related to an account
    List<Opportunity> findByAccountId(Long accountId);
    
    // Method to find opportunities whose created date is greater than 30 days from today
    List<Opportunity> findByCreatedDateGreaterThan(LocalDateTime cutoffDate);
    
    // Method to update the stage of an opportunity to Close Lost
    void updateStageToCloseLost(Long opportunityId);
    
    // Method to log changes made to opportunities' stages
    void logChangesToStage(Long opportunityId, String oldValue, String newValue, LocalDateTime timestamp);

}