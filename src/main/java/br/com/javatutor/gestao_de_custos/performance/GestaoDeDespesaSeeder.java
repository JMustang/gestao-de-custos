package br.com.javatutor.gestao_de_custos.performance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GestaoDeDespesaSeeder implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Rodando junto com a aplicação");
    }

}
