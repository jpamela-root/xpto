package com.xpto.dto;

public class EnderecoDTO {
    private Long id;
    private Long clienteId;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoDTO() {}

    public EnderecoDTO(Long id, Long clienteId, String rua, String cidade, String estado, String cep) {
        this.id = id;
        this.clienteId = clienteId;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
