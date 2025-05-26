package com.sistemafaq.sistemafaq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class SistemaFaqController {

    @GetMapping("/sistema")
    public String Sistema(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/aplicativos")
    public String Aplicativos(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/seguranca")
    public String Seguranca(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/email")
    public String Email(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/produtos")
    public String Produtos(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/configuracoes")
    public String Configuracoes(@RequestParam String param) {
        return new String();
    }
      

}