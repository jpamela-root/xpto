package com.xpto.service;

import com.xpto.model.dto.RelatorioReceitaDTO;
import com.xpto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RelatorioService {

    @Autowired
    private ReceitaService receitaService;

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public RelatorioReceitaDTO gerarRelatorioReceita(Long clienteId, LocalDate inicio, LocalDate fim) {
        RelatorioReceitaDTO relatorio = new RelatorioReceitaDTO();
        relatorio.setClienteId(clienteId);
        relatorio.setDataInicio(inicio);
        relatorio.setDataFim(fim);
        relatorio.setReceitaTotal(receitaService.calcularReceitaCliente(clienteId, inicio, fim));
        return relatorio;
    }
}

