package com.sistemafaq.sistemafaq.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemafaq.sistemafaq.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

  
}
