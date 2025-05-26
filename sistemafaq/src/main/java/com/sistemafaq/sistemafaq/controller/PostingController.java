package com.sistemafaq.sistemafaq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemafaq.sistemafaq.service.QuestionService;


@RestController
@RequestMapping("/faq")
public class PostingController {

    //responsavel por fazer a injeção da dependencia outra forma é por um construtor
    @Autowired
    private final QuestionService questionService;

    public PostingController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/sistema")
    public String Sistema(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/aplicativos")
    public String Aplicativos(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/seguranca")
    public String Seguranca(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/email")
    public String Email(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/produtos")
    public String Produtos(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/configuracoes")
    public String Configuracoes(@RequestParam String param) {
        return new String();
    }
      

}