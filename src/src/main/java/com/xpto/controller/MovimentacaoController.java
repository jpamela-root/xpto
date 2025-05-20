package com.xpto.controller;

import com.xpto.model.entity.Movimentacao;
import com.xpto.service.MovimentacaoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
@Tag(name = "Movimentações", description = "Controle de movimentações financeiras")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping
    public List<Movimentacao> listarTodas() {
        return movimentacaoService.listarTodas();
    }

    @GetMapping("/{id}")
    public Movimentacao buscarPorId(@PathVariable Long id) {
        return movimentacaoService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Movimentação não encontrada"));
    }

    @PostMapping
    public Movimentacao salvar(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.salvar(movimentacao);
    }

    @PutMapping("/{id}")
    public Movimentacao atualizar(@PathVariable Long id, @RequestBody Movimentacao movimentacao) {
        movimentacao.setId(id);
        return movimentacaoService.salvar(movimentacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        movimentacaoService.deletar(id);
    }
}