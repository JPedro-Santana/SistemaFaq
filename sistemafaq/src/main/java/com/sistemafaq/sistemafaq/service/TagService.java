package com.sistemafaq.sistemafaq.service;



import org.springframework.stereotype.Service;


import com.sistemafaq.sistemafaq.repository.TagRepository;

@Service
public class TagService {

    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

}
