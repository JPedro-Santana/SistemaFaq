package com.sistemafaq.sistemafaq.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer extends Posting {

    @ManyToOne
    private Question question;
    private Anexo anexo;

    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL)
    private List<Anexo> anexos;
}
