package com.xpto.model.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
