package com.vrj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrj1.model.Developer;
import com.vrj1.service.DeveloperService;

import java.util.List;

@RestController
@RequestMapping("/developers")
@CrossOrigin("*")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;


    @GetMapping("/totalResponses")
    public Integer getTotalResponses() {
        return developerService.getTotalResponses();
    }

    @GetMapping("/all")
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }
}
