package com.sistemafaq.sistemafaq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Question;
import com.sistemafaq.sistemafaq.repository.QuestionRepository;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    //Realizar o Crud das perguntas e listar as perguntas ao filtrar
    public List<Question> ListQuestion(){
        return questionRepository.findAll();
        
    }
    
}
