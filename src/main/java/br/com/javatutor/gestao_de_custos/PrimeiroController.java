package br.com.javatutor.gestao_de_custos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/javaapi")
@RestController
public class PrimeiroController {

    @GetMapping("/olamundo")
    public String olaMundo() {
        return "🚀 Olá Mundo!";
    }
}
