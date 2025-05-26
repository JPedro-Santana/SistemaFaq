package com.sistemafaq.sistemafaq.service;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.repository.QuestionRepository;

@Service
public class QuestionService {

    
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    
}
