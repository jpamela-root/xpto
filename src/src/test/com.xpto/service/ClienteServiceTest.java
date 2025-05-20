package com.xpto.service;

import com.xpto.dto.ClienteDTO;
import com.xpto.entity.Cliente;
import com.xpto.repository.ClienteRepository;
import com.xpto.service.impl.ClienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ClienteServiceTest {

    @Test
    void deveBuscarClientePorId() {
        ClienteRepository clienteRepository = mock(ClienteRepository.class);
        ClienteService clienteService = new ClienteServiceImpl(clienteRepository);

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Teste");

        when(clienteRepository.findById(1L)).thenReturn(Optional.of(cliente));

        ClienteDTO dto = clienteService.buscarPorId(1L);

        assertNotNull(dto);
        assertEquals("Teste", dto.getNome());
    }
}
