package com.sistemafaq.sistemafaq.model;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_answer")
public class Answer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
     @ManyToOne
     private User author;
     
     private LocalDate date;
     @Column(name="content", length=5000)
     private String content;
     private Tag tag;
     private Integer likes = 0;
     private Boolean solved = true;

 /* 
    @ManyToOne
     @JoinColumn(name = "pergunta_id", nullable = false)
    private Question question; */
   
}
