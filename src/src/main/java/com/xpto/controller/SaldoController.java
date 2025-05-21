package com.xpto.controller;

import com.xpto.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/saldo")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;

    @GetMapping("/{idCliente}")
    public Double consultarSaldo(@PathVariable Long idCliente) {
        return saldoService.getSaldoCliente(idCliente);
    }
}
