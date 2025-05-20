package com.xpto.controller;

import com.xpto.dto.RelatorioSaldoDTO;
import com.xpto.service.ReceitaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RelatorioController.class)
class RelatorioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReceitaService receitaService;

    @Test
    void deveRetornarRelatorioDeSaldo() throws Exception {
        RelatorioSaldoDTO dto = new RelatorioSaldoDTO();
        dto.setClienteId(1L);
        dto.setSaldoTotal(BigDecimal.valueOf(1000.00));

        Mockito.when(receitaService.calcularSaldo(1L)).thenReturn(dto);

        mockMvc.perform(get("/api/relatorios/saldo/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.saldoTotal").value(1000.00));
    }
}
