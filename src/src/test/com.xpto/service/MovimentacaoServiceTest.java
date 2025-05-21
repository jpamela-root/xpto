package com.xpto.service;

import com.xpto.model.entity.Movimentacao;
import com.xpto.repository.MovimentacaoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MovimentacaoServiceTest {

    @Mock
    private MovimentacaoRepository movimentacaoRepository;

    @InjectMocks
    private MovimentacaoService movimentacaoService;

    @Tes
    void deveRetornarMovimentacaoQuandoIdExistir() {
        Movimentacao mov = new Movimentacao();
        mov.setId(1L);
        mov.setDescricao("Compra");

        when(movimentacaoRepository.findById(1L)).thenReturn(Optional.of(mov));

        Movimentacao resultado = movimentacaoService.buscarPorId(1L);

        assertNotNull(resultado);
        assertEquals("Compra", resultado.getDescricao());
        verify(movimentacaoRepository, times(1)).findById(1L);
    }

    @Test
    void deveLancarExcecaoQuandoMovimentacaoNaoForEncontrada() {
        when(movimentacaoRepository.findById(2L)).thenReturn(Optional.empty());

        RuntimeException excecao = assertThrows(RuntimeException.class, () -> {
            movimentacaoService.buscarPorId(2L);
        });

        assertEquals("Movimentação não encontrada", excecao.getMessage());
    }
}