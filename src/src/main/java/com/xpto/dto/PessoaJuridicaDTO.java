package com.xpto.dto;

public class PessoaJuridicaDTO extends ClienteDTO {
    private String cnpj;

    public PessoaJuridicaDTO() {}

    public PessoaJuridicaDTO(Long id, String nome, String cnpj) {
        super(id, nome, "PessoaJuridica");
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
