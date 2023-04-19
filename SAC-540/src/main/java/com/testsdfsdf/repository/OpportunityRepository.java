package com.testsdfsdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.testsdfsdf.model.Opportunity;

public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {
	
	@Query("SELECT o FROM Opportunity o WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won'")
	public List<Opportunity> findOpportunitiesToUpdate();
	
	@Query("UPDATE Opportunity o SET o.stage = 'Close Lost' WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won'")
	public void updateOpportunityStage();
	
	@Query("SELECT o FROM Opportunity o WHERE o.accountId = :accountId")
	public List<Opportunity> findOpportunitiesByAccountId(Long accountId);
	
	@Query("SELECT o FROM Opportunity o WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won' AND o.accountId = :accountId")
	public List<Opportunity> findOpportunitiesToUpdateByAccountId(Long accountId);
	
	@Query("UPDATE Opportunity o SET o.stage = 'Close Lost' WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won' AND o.accountId = :accountId")
	public void updateOpportunityStageByAccountId(Long accountId);
	
	@Query("SELECT o FROM Opportunity o WHERE o.stage = :stage")
	public List<Opportunity> findOpportunitiesByStage(String stage);
	
	@Query("SELECT o FROM Opportunity o WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won' AND o.stage = :stage")
	public List<Opportunity> findOpportunitiesToUpdateByStage(String stage);
	
	@Query("UPDATE Opportunity o SET o.stage = 'Close Lost' WHERE o.createdDate > 30 days FROM today AND o.stage != 'Close Won' AND o.stage = :stage")
	public void updateOpportunityStageByStage(String stage);
	
	@Query("INSERT INTO Opportunity o (oldStage, newStage, dateTime) VALUES (:oldStage, :newStage, :dateTime)")
	public void logChanges(String oldStage, String newStage, Date dateTime);
}