package com.sistemafaq.sistemafaq.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
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
    private Integer likes = 0;

    //private List<Answer> answer;

    //tag
      /*lista com respostas?

        @ManyToOne
         @JoinColumn(name = "category_id", nullabel=false)
        private Category category;

    @ElementCollection
    private List<String> tags; ou
    @CollectionTable(name = "pergunta_tags", joinColumns = @JoinColumn(name = "pergunta_id"))
    @Column(name = "tag")
    private Set<String> tags = new HashSet<>();  // Tags para filtragem

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();*/

}
