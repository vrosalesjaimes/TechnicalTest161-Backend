package com.vrj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrj1.model.Respondent;
import com.vrj1.service.RespondentService;

import java.util.List;

@RestController
@RequestMapping("/respondents")
@CrossOrigin("*")
public class RespondentController {

    @Autowired
    private RespondentService respondentService;

    @GetMapping("/totalResponses")
    public Integer getTotalResponses() {
        return respondentService.getTotalResponses();
    }

    @GetMapping("/all")
    public List<Respondent> getAllRespondents() {
        return respondentService.getAllRespondents();
    }
}
