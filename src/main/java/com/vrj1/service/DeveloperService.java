package com.vrj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrj1.model.Developer;
import com.vrj1.repository.DeveloperRepository;

import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperRepository developerRepository;

    public Integer getTotalResponses() {
        return developerRepository.getTotalResponses();
    }

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }
}
