package com.vrj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrj1.model.Other;
import com.vrj1.repository.OtherRepository;

import java.util.List;

@Service
public class OtherService {

    @Autowired
    private OtherRepository otherRepository;

    public Integer getTotalResponses() {
        return otherRepository.getTotalResponses();
    }

    public List<Other> getAllOthers() {
        return otherRepository.findAll();
    }
}
