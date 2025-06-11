package com.sistemafaq.sistemafaq.model;




import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name="tb_question")
public class Question{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

     @Column(name="title", nullable=false)
     private String title;
     @Column(columnDefinition="TEXT", nullable=false)
     private String content;
    private Boolean solved = false;
    private User author;
    private int likes = 0;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();
    @ElementCollection
    private List<String> tags;

    //tag
      /*lista com respostas?

        @ManyToOne
         @JoinColumn(name = "category_id", nullabel=false)
        private Category category;

     ou
    @CollectionTable(name = "pergunta_tags", joinColumns = @JoinColumn(name = "pergunta_id"))
    @Column(name = "tag")
    private Set<String> tags = new HashSet<>();  // Tags para filtragem

    */ 

}
