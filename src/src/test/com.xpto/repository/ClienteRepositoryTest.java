package com.xpto.repository;

import com.xpto.entity.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void deveSalvarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Maria Teste");

        Cliente salvo = clienteRepository.save(cliente);

        assertNotNull(salvo.getId());
        assertEquals("Maria Teste", salvo.getNome());
    }
}

