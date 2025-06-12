package com.sistemafaq.sistemafaq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.sistemafaq.sistemafaq.model.Pergunta;
import com.sistemafaq.sistemafaq.service.PerguntaService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/perguntas")
public class PerguntaController {

    private PerguntaService perguntaService;

    @GetMapping("/categoria/{id}")
    public List<Pergunta> buscarCategoria(@PathVariable Long id){
        return perguntaService.buscaPorCategoria(id);
    }

    @GetMapping("/buscar")
    public List<Pergunta> buscar(@RequestParam String p ){
        return perguntaService.buscaPorPalavraChave(p);
    }
}