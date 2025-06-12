package com.sistemafaq.sistemafaq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemafaq.sistemafaq.repository.TagRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class TagController {

    private final TagRepository tagRepository;

}
