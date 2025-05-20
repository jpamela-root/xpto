package com.xpto.dto;

import java.math.BigDecimal;

public class RelatorioReceitaDTO {
    private Long contaId;
    private BigDecimal totalReceitas;

    public RelatorioReceitaDTO() {}

    public RelatorioReceitaDTO(Long contaId, BigDecimal totalReceitas) {
        this.contaId = contaId;
        this.totalReceitas = totalReceitas;
    }

    public Long getContaId() {
        return contaId;
    }

    public void setContaId(Long contaId) {
        this.contaId = contaId;
    }

    public BigDecimal getTotalReceitas() {
        return totalReceitas;
    }

    public void setTotalReceitas(BigDecimal totalReceitas) {
        this.totalReceitas = totalReceitas;
    }
}
