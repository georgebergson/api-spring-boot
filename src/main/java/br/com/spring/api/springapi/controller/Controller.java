package br.com.spring.api.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.spring.api.springapi.model.Pessoa;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String mostrar(){
        return "Hello Word";
    }

    @GetMapping("/acessar")
    public String entrar(){
        return "Seja Bem Vindo";
    }

    @GetMapping("/acessar/{nome}")
    public String entrou(@PathVariable String nome){
        return "Parabens pelo seu Login "+ nome;
    }

    @PostMapping("/pessoa")
    public Pessoa postMethodName(@RequestBody Pessoa dados) {
        return dados;
    }
    
}
