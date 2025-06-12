package com.sistemafaq.sistemafaq.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.sistemafaq.sistemafaq.model.Categoria;
import com.sistemafaq.sistemafaq.service.CategoriaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

     @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listar();
    }

}
