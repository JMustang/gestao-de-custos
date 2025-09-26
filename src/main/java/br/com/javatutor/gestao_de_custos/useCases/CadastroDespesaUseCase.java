package br.com.javatutor.gestao_de_custos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.repository.DespesaRepository;

@Service
public class CadastroDespesaUseCase {

    @Autowired
    private DespesaRepository despesaRepository;

    public void execute(Despesa despesa) {
        despesaRepository.save(despesa);
    }
}
