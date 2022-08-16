package com.meuexemplo.controledepessoas.controller;

import java.util.ArrayList;
import java.util.List;

import com.meuexemplo.controledepessoas.model.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    

    @GetMapping
    public List<Pessoa> obterTodos(){
        Pessoa p1 = new Pessoa();
        p1.setNome("Fabíola");
        p1.setEmail("damasceno.fabi@gmail.com");
        p1.setTelefone("1497969696");

        Pessoa p2 = new Pessoa();

       ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

       pessoas.add(p1);
       pessoas.add(p2);


       return pessoas;

    }
}
