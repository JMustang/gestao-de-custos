package br.com.javatutor.gestao_de_custos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.repository.DespesaRepository;

@Service
public class CadastroDespesaUseCase {

    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa execute(Despesa despesa) {

        if (despesa.getCategoria() == null || despesa.getData() == null || despesa.getDescricao() == null
                || despesa.getEmail() == null) {
            throw new IllegalArgumentException("❌ Campos obrigatorios não podem ser nulos");
        }

        despesa = despesaRepository.save(despesa);
        return despesa;
    }
}
