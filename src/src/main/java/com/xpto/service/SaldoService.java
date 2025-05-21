package com.xpto.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class SaldoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Double getSaldoCliente(Long idCliente) {
        return jdbcTemplate.queryForObject(
                "SELECT fn_saldo_total_cliente(?) FROM dual",
                new Object[]{idCliente},
                Double.class
        );
    }
}
