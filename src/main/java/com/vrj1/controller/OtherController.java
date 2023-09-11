package com.vrj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrj1.model.Other;
import com.vrj1.service.OtherService;

import java.util.List;

@RestController
@RequestMapping("/other")
@CrossOrigin("*")
public class OtherController {

    @Autowired
    private OtherService otherService;


    @GetMapping("/totalResponses")
    public Integer getTotalResponses() {
        return otherService.getTotalResponses();
    }

    @GetMapping("/all")
    public List<Other> getAllOthers() {
        return otherService.getAllOthers();
    }
}
