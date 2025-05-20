package com.xpto.dto;

import java.math.BigDecimal;

public class ContaBancariaDTO {
    private Long id;
    private Long clienteId;
    private BigDecimal saldo;

    public ContaBancariaDTO() {}

    public ContaBancariaDTO(Long id, Long clienteId, BigDecimal saldo) {
        this.id = id;
        this.clienteId = clienteId;
        this.saldo = saldo;
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
