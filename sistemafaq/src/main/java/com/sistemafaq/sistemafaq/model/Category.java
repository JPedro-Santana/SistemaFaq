package com.sistemafaq.sistemafaq.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_category")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
     @Column(name="name", unique=true)
    private String name;
    private String icon;

    // cada categoria vai ter uma lista com suas respectivas perguntas
    private  List<Question> questionList = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Tag> tags = new ArrayList<>();

}
