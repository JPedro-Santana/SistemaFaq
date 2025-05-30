package com.sistemafaq.sistemafaq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Answer;
import com.sistemafaq.sistemafaq.repository.AnswerRepository;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    //Realizar o Crud das repostas
    public List<Answer> ListAnswer(){
        return null;
        
    }

}
