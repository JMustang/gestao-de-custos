package br.com.javatutor.gestao_de_custos.performance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.javatutor.gestao_de_custos.entity.Despesa;
import br.com.javatutor.gestao_de_custos.repository.DespesaRepository;

@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {

    @Autowired
    DespesaRepository despesaRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Despesa> despesas = new ArrayList<>();

        for (int i = 0; i <= 150000; i++) {
            Despesa despesa = new Despesa();
            despesa.setDescricao("Gasto n*: " + i);
            despesa.setValor(BigDecimal.valueOf(10 + (i % 50)));
            despesa.setData(LocalDate.now().minusDays(i % 30));
            despesa.setCategoria("TESTE");
            despesa.setEmail("performance@gmail.com");

            despesas.add(despesa);
        }

        despesaRepository.saveAll(despesas);
    }

}
