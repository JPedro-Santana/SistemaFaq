package com.sistemafaq.sistemafaq.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Categoria;
import com.sistemafaq.sistemafaq.model.Pergunta;
import com.sistemafaq.sistemafaq.repository.CategoriaRepository;
import com.sistemafaq.sistemafaq.repository.PerguntaRepository;
import com.sistemafaq.sistemafaq.repository.TagRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PerguntaService {

    private final PerguntaRepository perguntaRepository;

    private CategoriaRepository categoriaRepository;

    private TagRepository tagRepository;

    public List<Pergunta> listarAprovadasPorCategoria(Long categoriaId) {
        return perguntaRepository.findByCategoriaIdAndAprovadaTrue(categoriaId);
    }

    public Pergunta criarPergunta(Pergunta pergunta) {
        pergunta.setAprovada(false);

        // Verifica se a categoria existe
        if (pergunta.getCategoria() != null && pergunta.getCategoria().getId() != null) {
            Categoria categoria = categoriaRepository.findById(pergunta.getCategoria().getId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
            pergunta.setCategoria(categoria);
        }

        // Trata as tags: se já existem, reutiliza; senão, salva
        if (pergunta.getTags() != null && !pergunta.getTags().isEmpty()) {
            List<Tag> tagsTratadas = pergunta.getTags().stream().map(tag -> {
                return tagRepository.findByNome(tag.getNome())
                    .orElseGet(() -> tagRepository.save(tag));
            }).toList();
            pergunta.setTags(tagsTratadas);
        }

        return perguntaRepository.save(pergunta);
    }

    public List<Pergunta> listarPendentes() {
        return perguntaRepository.findByAprovadaFalse();
    }

    public Pergunta aprovar(Long id) {
        Pergunta pergunta = perguntaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pergunta não encontrada"));
        pergunta.setAprovada(true);
        return perguntaRepository.save(pergunta);
    }

    public void deletar(Long id) {
        perguntaRepository.deleteById(id);
    }

    public List<Pergunta> buscarPorTermo(String termo) {
        return perguntaRepository.buscarPorTermo(termo);
    }

    public List<Pergunta> filtrarPorTags(List<String> tags) {
        return perguntaRepository.findByTags(tags);
    }
}
