package com.vrj1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vrj1.model.Learning;

public interface LearningRepository extends JpaRepository<Learning, Long> {

    @Query("SELECT SUM(l.responses) FROM Learning l")
    Integer getTotalResponses();
    
    List<Learning> findAll();
}
