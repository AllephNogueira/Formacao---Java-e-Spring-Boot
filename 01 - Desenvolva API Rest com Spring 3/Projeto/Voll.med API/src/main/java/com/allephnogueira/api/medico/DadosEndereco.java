package com.allephnogueira.api.medico;

public record DadosEndereco(
							String logradouro,
							String bairro,
							String cidade,
							String uf,
							String numero,
							String complemento) {
}
