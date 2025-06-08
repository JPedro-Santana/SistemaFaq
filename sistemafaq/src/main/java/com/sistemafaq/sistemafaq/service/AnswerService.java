package com.sistemafaq.sistemafaq.service;


import org.springframework.stereotype.Service;


import com.sistemafaq.sistemafaq.repository.AnswerRepository;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }



}
