package com.sistemafaq.sistemafaq.service;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.repository.TagRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TagService {

    private final TagRepository tagRepository;

    //lista as categorias e adiciona nomes, usuários busquem dúvidas por meio de palavras-chave

}
