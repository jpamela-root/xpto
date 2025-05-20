package com.xpto.service;

import com.xpto.model.entity.Movimentacao;
import com.xpto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public BigDecimal calcularReceitaCliente(Long clienteId, LocalDate inicio, LocalDate fim) {
        List<Movimentacao> movimentacoes = movimentacaoRepository
                .findByClienteIdAndDataBetween(clienteId, inicio.atStartOfDay(), fim.atTime(23, 59, 59));

        int quantidade = movimentacoes.size();

        if (quantidade <= 10) {
            return BigDecimal.valueOf(quantidade).multiply(BigDecimal.ONE);
        } else if (quantidade <= 20) {
            return BigDecimal.valueOf(quantidade).multiply(new BigDecimal("0.75"));
        } else {
            return BigDecimal.valueOf(quantidade).multiply(new BigDecimal("0.50"));
        }
    }
}
