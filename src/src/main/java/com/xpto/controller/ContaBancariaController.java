package com.xpto.controller;

import com.xpto.model.entity.ContaBancaria;
import com.xpto.service.ContaBancariaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
@Tag(name = "Contas Bancárias", description = "Operações com contas bancárias")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaService contaService;

    @GetMapping
    public List<ContaBancaria> listarTodas() {
        return contaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ContaBancaria buscarPorId(@PathVariable Long id) {
        return contaService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    @PostMapping
    public ContaBancaria salvar(@RequestBody ContaBancaria conta) {
        return contaService.salvar(conta);
    }

    @PutMapping("/{id}")
    public ContaBancaria atualizar(@PathVariable Long id, @RequestBody ContaBancaria conta) {
        conta.setId(id);
        return contaService.salvar(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        contaService.deletar(id);
    }
}