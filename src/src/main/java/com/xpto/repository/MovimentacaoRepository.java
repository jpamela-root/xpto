package com.xpto.repository;

import com.xpto.model.entity.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    List<Movimentacao> findByClienteIdAndDataBetween(Long clienteId, LocalDateTime inicio, LocalDateTime fim);
}