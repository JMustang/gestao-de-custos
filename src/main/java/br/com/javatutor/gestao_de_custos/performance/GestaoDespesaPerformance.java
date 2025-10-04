package br.com.javatutor.gestao_de_custos.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.repository.DespesaRepository;

@RequestMapping("/gestao/performance")
public class GestaoDespesaPerformance {

    @Autowired
    DespesaRepository repository;

    public ResponseEntity<List<Despesa>> listarSemPaginacao() {
        var despesas = repository.findAll();

        return ResponseEntity.ok(despesas);
    }
}
