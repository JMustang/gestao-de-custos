package br.com.javatutor.gestao_de_custos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.useCases.CadastroDespesaUseCase;

@RequestMapping("/gestao")
@RestController
public class GestaoDispesaController {

    @PostMapping("/create")
    public void create(@RequestBody Despesa despesa) {
        CadastroDespesaUseCase cadastroDespesaUseCase = new CadastroDespesaUseCase();
        cadastroDespesaUseCase.execute(despesa);
    }
}
