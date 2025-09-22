package br.com.javatutor.gestao_de_custos.useCases;

import org.springframework.stereotype.Service;

import br.com.javatutor.gestao_de_custos.entity.Despesa;

@Service
public class CadastroDespesaUseCase {

    public void execute(Despesa despesa) {
        System.out.println(despesa);
    }
}
