package com.sistemafaq.sistemafaq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemafaq.sistemafaq.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/faq")
@RequiredArgsConstructor
public class QuestionController {

    
    private final QuestionService questionService;

      

}