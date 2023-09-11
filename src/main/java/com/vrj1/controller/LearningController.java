package com.vrj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrj1.model.Learning;
import com.vrj1.service.LearningService;

import java.util.List;

@RestController
@RequestMapping("/learning")
@CrossOrigin("*")
public class LearningController {

    @Autowired
    private LearningService learningService;
    
    @GetMapping("/totalResponses")
    public Integer getTotalResponses() {
        return learningService.getTotalResponses();
    }

    @GetMapping("/all")
    public List<Learning> getAllLearning() {
        return learningService.getAllLearning();
    }
}
