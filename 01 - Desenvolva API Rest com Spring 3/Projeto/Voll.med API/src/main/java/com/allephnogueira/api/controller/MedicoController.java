package com.allephnogueira.api.controller;


import com.allephnogueira.api.medico.DadosCadastroMedicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Estou dizendo que essa classe é um controller.
@RequestMapping("medicos") // Sempre quando chegar uma requisição para medicos o spring vai entender que é para chamar essa classe
public class MedicoController {

    @PostMapping // Estou dizendo que o tipo de dado que vai ter que chegar tem que ser um POST
    public void cadastrar(@RequestBody DadosCadastroMedicos dados) { // RequestBody quer dizer: Spring pegue os dados do corpo da requisição!
        System.out.println(dados);
    }
}
