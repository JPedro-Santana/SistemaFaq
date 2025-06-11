package com.sistemafaq.sistemafaq.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemafaq.sistemafaq.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
   
     List<Question> findByCategoryName(String categoryName);
    /*
     @Query("SELECT p FROM Pergunta p WHERE " +
           "fts(:query) = true OR " + // PostgreSQL full-text search
           "LOWER(p.titulo) LIKE LOWER(concat('%', :query, '%')) OR " +
           "LOWER(p.descricao) LIKE LOWER(concat('%', :query, '%'))")
    List<Pergunta> buscarPorPalavraChave(@Param("query") String query);
    
    // Perguntas mais úteis
    Page<Pergunta> findAllByOrderByVotosUteisDesc(Pageable pageable);
    
     Page<Pergunta> findAllByOrderByVotosUteisDesc(Pageable pageable);
    */    
    
    

}
