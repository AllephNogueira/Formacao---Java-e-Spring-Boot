package com.allephnogueira.api.controller;


import com.allephnogueira.api.endereco.Endereco;
import com.allephnogueira.api.medico.DadosCadastroMedicos;
import com.allephnogueira.api.medico.Medico;
import com.allephnogueira.api.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Estou dizendo que essa classe é um controller.
@RequestMapping("medicos") // Sempre quando chegar uma requisição para medicos o spring vai entender que é para chamar essa classe
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping // Estou dizendo que o tipo de dado que vai ter que chegar tem que ser um POST
    @Transactional // Esse metodo é porque vamos ter uma transação em escrita entao precisamos ter.
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados) { // RequestBody quer dizer: Spring pegue os dados do corpo da requisição!
        // Valid é para pedir para o Spring se conectar com as validações que fizemos.
        repository.save(new Medico(dados));
    }
}
