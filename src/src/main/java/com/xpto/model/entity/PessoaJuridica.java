package com.xpto.model.entity;

import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
