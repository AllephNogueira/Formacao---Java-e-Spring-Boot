package com.allephnogueira.api.medico;

public record DadosCadastroMedicos(String nome,
                                   String email,
                                   String crm,
                                   Especialidade especialidade, // Lembra que especialidade vai ser fixo, então vamos criar um enum.
                                   DadosEndereco endereco) {
}
