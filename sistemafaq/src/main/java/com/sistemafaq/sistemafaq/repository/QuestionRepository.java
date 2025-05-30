package com.sistemafaq.sistemafaq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemafaq.sistemafaq.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question>findByCateogoryId(Long categoryId);
    

}
