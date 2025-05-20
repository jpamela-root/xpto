package com.xpto.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MovimentacaoDTO {
    private Long id;
    private Long contaId;
    private BigDecimal valor;
    private String tipo; // Receita ou Despesa
    private LocalDateTime data;

    public MovimentacaoDTO() {}

    public MovimentacaoDTO(Long id, Long contaId, BigDecimal valor, String tipo, LocalDateTime data) {
        this.id = id;
        this.contaId = contaId;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
