package com.vrj1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vrj1.model.Respondent;

public interface RespondentRepository extends JpaRepository<Respondent, Long> {

    @Query("SELECT SUM(r.responses) FROM Respondent r")
    Integer getTotalResponses();
    
    List<Respondent> findAll();
}

