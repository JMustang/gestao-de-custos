package br.com.javatutor.gestao_de_custos.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.repository.DespesaRepository;

@RequestMapping("/gestao/performance")
@RestController
public class GestaoDespesaPerformance {

    @Autowired
    DespesaRepository repository;

    @GetMapping("/sem-paginacao")
    public ResponseEntity<List<Despesa>> listarSemPaginacao() {
        long inicio = System.currentTimeMillis();
        var despesas = repository.findAll();

        long fim = System.currentTimeMillis();
        System.out.println("Tempo Gasto sem paginação: " + (fim - inicio) + " ms");
        return ResponseEntity.ok(despesas);
    }
}
