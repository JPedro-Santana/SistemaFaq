package com.sistemafaq.sistemafaq.model;

import java.time.LocalDate;

import jakarta.persistence.ManyToOne;

public abstract class PostingModel {
    @ManyToOne
    protected UserModel user;
    protected LocalDate date;
    protected String content;
    protected Integer curtidas = 0;

}
