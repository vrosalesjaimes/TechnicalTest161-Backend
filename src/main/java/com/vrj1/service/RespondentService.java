package com.vrj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrj1.model.Respondent;
import com.vrj1.repository.RespondentRepository;

import java.util.List;

@Service
public class RespondentService {

    @Autowired
    private RespondentRepository respondentRepository;


    public Integer getTotalResponses() {
        return respondentRepository.getTotalResponses();
    }

    public List<Respondent> getAllRespondents() {
        return respondentRepository.findAll();
    }
}
