package com.xpto.dto;

import java.math.BigDecimal;

public class RelatorioSaldoDTO {
    private Long contaId;
    private BigDecimal saldo;

    public RelatorioSaldoDTO() {}

    public RelatorioSaldoDTO(Long contaId, BigDecimal saldo) {
        this.contaId = contaId;
        this.saldo = saldo;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
