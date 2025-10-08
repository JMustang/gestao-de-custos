package br.com.javatutor.gestao_de_custos.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
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

    @GetMapping("/com-paginacao")
    public ResponseEntity<Page<Despesa>> listarComPaginacao(Pageable pageable) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        var despesas = repository.findAll(pageable);

        stopWatch.stop();
        System.out.println("Tempo Gasto com paginação: " + stopWatch.getTotalTimeMillis() + " ms");
        return ResponseEntity.ok(despesas);
    }
}
