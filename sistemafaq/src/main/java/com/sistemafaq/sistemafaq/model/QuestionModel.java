package com.sistemafaq.sistemafaq.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="question")
public class QuestionModel extends PostingModel {
    
    
    @ManyToOne
    private UserModel user;
    //filtro
    //anexo
    //sistema de votos

}
