package com.vrj1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vrj1.model.Other;

public interface OtherRepository extends JpaRepository<Other, Long> {

    @Query("SELECT SUM(o.responses) FROM Other o")
    Integer getTotalResponses();
    
    List<Other> findAll();
}
