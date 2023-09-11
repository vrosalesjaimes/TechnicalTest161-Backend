package com.vrj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrj1.model.Learning;
import com.vrj1.repository.LearningRepository;

import java.util.List;

@Service
public class LearningService {

    @Autowired
    private LearningRepository learningRepository;

    public Integer getTotalResponses() {
        return learningRepository.getTotalResponses();
    }

    public List<Learning> getAllLearning() {
        return learningRepository.findAll();
    }
}
