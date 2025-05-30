package com.sistemafaq.sistemafaq.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sistemafaq.sistemafaq.service.AnswerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

}
