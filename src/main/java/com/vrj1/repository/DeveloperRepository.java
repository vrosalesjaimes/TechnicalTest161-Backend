package com.vrj1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vrj1.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    @Query("SELECT SUM(d.responses) FROM Developer d")
    Integer getTotalResponses();
    
    List<Developer> findAll();
}