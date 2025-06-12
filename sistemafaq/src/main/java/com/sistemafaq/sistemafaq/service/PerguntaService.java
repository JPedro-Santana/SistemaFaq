package com.sistemafaq.sistemafaq.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Pergunta;
import com.sistemafaq.sistemafaq.repository.PerguntaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PerguntaService {

    private final PerguntaRepository perguntaRepository;


    public List<Pergunta> buscaPorCategoria(Long categoriaId) {
        return perguntaRepository.findByCategoriaId(categoriaId);
    }

    public List<Pergunta> buscaPorPalavraChave(String keyword){
        return perguntaRepository.findByTitulo(keyword);
    }

}
