package com.sistemafaq.sistemafaq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

     @GetMapping("/categoria/{categoriaId}")
    public List<Pergunta> listarAprovadasPorCategoria(@PathVariable Long categoriaId) {
        return perguntaService.listarAprovadasPorCategoria(categoriaId);
    }

    @PostMapping
    public ResponseEntity<?> criarPergunta(@RequestBody Pergunta pergunta) {
        perguntaService.criarPergunta(pergunta);
        return ResponseEntity.status(HttpStatus.CREATED).body("Pergunta enviada para aprovação.");
    }

    @GetMapping("/pendentes")
    public List<Pergunta> listarPendentes() {
        return perguntaService.listarPendentes();
    }

    @PutMapping("/{id}/aprovar")
    public ResponseEntity<?> aprovar(@PathVariable Long id) {
        perguntaService.aprovar(id);
        return ResponseEntity.ok("Pergunta aprovada.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        perguntaService.deletar(id);
        return ResponseEntity.ok("Pergunta deletada.");
    }

    @GetMapping("/pesquisar")
    public List<Pergunta> pesquisar(@RequestParam String termo) {
        return perguntaService.buscarPorTermo(termo);
    }

    @GetMapping("/filtrar")
    public List<Pergunta> filtrarPorTags(@RequestParam List<String> tags) {
        return perguntaService.filtrarPorTags(tags);
    }
}