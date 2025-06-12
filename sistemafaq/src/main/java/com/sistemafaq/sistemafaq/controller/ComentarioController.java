package com.sistemafaq.sistemafaq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemafaq.sistemafaq.model.Comentario;
import com.sistemafaq.sistemafaq.service.ComentarioService;


@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired private ComentarioService service;

    @PostMapping
    public Comentario comentar(@RequestParam String nome, @RequestParam String conteudo, @RequestParam Long categoriaId) {
        return service.enviarComentario(nome, conteudo, categoriaId);
    }

    @GetMapping("/pendentes")
    public List<Comentario> pendentes() {
        return service.listar();
    }

    @PostMapping("/{id}/aprovar")
    public void aprovar(@PathVariable Long id) {
        service.aprovarComentario(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarComentario(id);
    }
}
