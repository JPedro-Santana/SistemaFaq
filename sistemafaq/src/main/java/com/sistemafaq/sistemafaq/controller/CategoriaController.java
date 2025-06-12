package com.sistemafaq.sistemafaq.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.sistemafaq.sistemafaq.model.Categoria;
import com.sistemafaq.sistemafaq.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

     @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }




}
