package br.com.javatutor.gestao_de_custos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.useCases.CadastroDespesaUseCase;

@RequestMapping("/gestao")
@RestController
public class GestaoDispesaController {

    @Autowired
    CadastroDespesaUseCase cadastroDespesaUseCase;

    @PostMapping("/create")
    public void create(@RequestBody Despesa despesa) {
        cadastroDespesaUseCase.execute(despesa);
    }
}
