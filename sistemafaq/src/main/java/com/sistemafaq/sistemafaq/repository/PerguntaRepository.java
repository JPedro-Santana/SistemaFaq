package com.sistemafaq.sistemafaq.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sistemafaq.sistemafaq.model.Pergunta;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
/*    @Query("SELECT p FROM Question p WHERE p.aproved = true AND " +
       "(LOWER(p.content) LIKE LOWER(CONCAT('%', :termo, '%')) OR " +
       "LOWER(p.answer) LIKE LOWER(CONCAT('%', :termo, '%')))")
    List<Pergunta> buscarPorTermo(@Param("termo") String termo);*/
    List<Pergunta> findByCategoriaId(Long categoriaId);
    List<Pergunta> findByTitulo(String keyword);
       

}
