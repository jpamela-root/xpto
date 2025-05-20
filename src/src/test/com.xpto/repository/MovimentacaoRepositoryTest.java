package com.xpto.repository;

import com.xpto.entity.Movimentacao;
import com.xpto.enums.TipoMovimentacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MovimentacaoRepositoryTest {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Test
    void deveSalvarMovimentacao() {
        Movimentacao m = new Movimentacao();
        m.setData(LocalDate.now());
        m.setTipo(TipoMovimentacao.RECEITA);
        m.setValor(BigDecimal.valueOf(300.00));

        Movimentacao salvo = movimentacaoRepository.save(m);

        assertNotNull(salvo.getId());
        assertEquals(TipoMovimentacao.RECEITA, salvo.getTipo());
    }
}
