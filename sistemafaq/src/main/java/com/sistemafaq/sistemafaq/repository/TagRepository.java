package com.sistemafaq.sistemafaq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemafaq.sistemafaq.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

  
    //find by tag?
}
