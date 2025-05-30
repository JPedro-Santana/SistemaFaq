package com.sistemafaq.sistemafaq.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
//Classe abstrata que sera utilizada pelo model de pergunta e resposta pois os dois tem aspectos semelhantes
@Data
@NoArgsConstructor

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Posting {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;
    
    @ManyToOne
    protected User author;
    protected LocalDate date;
    protected String content;
    protected Integer likes;

}
