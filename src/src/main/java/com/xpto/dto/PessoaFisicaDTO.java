package com.xpto.dto;

public class PessoaFisicaDTO extends ClienteDTO {
    private String cpf;

    public PessoaFisicaDTO() {}

    public PessoaFisicaDTO(Long id, String nome, String cpf) {
        super(id, nome, "PessoaFisica");
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
