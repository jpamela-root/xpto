package com.xpto.service;

import com.xpto.dto.RelatorioSaldoDTO;
import com.xpto.repository.MovimentacaoRepository;
import com.xpto.service.impl.ReceitaServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaServiceTest {

    @Test
    void deveCalcularSaldo() {
        MovimentacaoRepository movimentacaoRepository = Mockito.mock(MovimentacaoRepository.class);
        ReceitaService receitaService = new ReceitaServiceImpl(movimentacaoRepository);

        Mockito.when(movimentacaoRepository.calcularSaldo(1L)).thenReturn(BigDecimal.valueOf(1200.00));

        RelatorioSaldoDTO dto = receitaService.calcularSaldo(1L);

        assertNotNull(dto);
        assertEquals(BigDecimal.valueOf(1200.00), dto.getSaldoTotal());
    }
}
