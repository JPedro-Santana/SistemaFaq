package com.sistemafaq.sistemafaq.service;




import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.repository.QuestionRepository;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    //Realizar o Crud das perguntas e listar as perguntas ao filtrar
     //find by id

    //crud, dúvidas que ainda não foram respondidas, dúvidas classificadas por categorias, Sistema de Curtidas ou Avaliação
   

   

}
