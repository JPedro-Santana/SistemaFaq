package com.sistemafaq.sistemafaq.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Comentario;
import com.sistemafaq.sistemafaq.repository.CategoriaRepository;
import com.sistemafaq.sistemafaq.repository.ComentarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ComentarioService {

    private final CategoriaRepository categoriaRepository;
    private final ComentarioRepository comentarioRepository;

    public Comentario enviarComentario(String nome, String conteudo, Long categoriaId){
        Comentario comentario = new Comentario();
         comentario.setNomeUsuario(nome);
        comentario.setConteudo(conteudo);
        comentario.setAprovado(false);
        comentario.setCategoria(categoriaRepository.findById(categoriaId).orElseThrow());
        return comentarioRepository.save(comentario);
        
    }

     public List<Comentario> listar(){
    return comentarioRepository.findAll();
    }

    public List<Comentario> listarAprovados() {
    return comentarioRepository.findByAprovado(true);
    }

    public void aprovarComentario(Long id) {
        Comentario c = comentarioRepository.findById(id).orElseThrow();
        c.setAprovado(true);
        comentarioRepository.save(c);
    }

    public void deletarComentario(Long id){
        comentarioRepository.deleteById(id);
    }


}
