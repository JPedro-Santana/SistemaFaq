package com.sistemafaq.sistemafaq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Categoria;
import com.sistemafaq.sistemafaq.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }

}
