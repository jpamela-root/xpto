package com.xpto.service;

import com.xpto.model.entity.ContaBancaria;
import com.xpto.repository.ContaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaBancariaService {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public List<ContaBancaria> listarTodas() {
        return contaBancariaRepository.findAll();
    }

    public Optional<ContaBancaria> buscarPorId(Long id) {
        return contaBancariaRepository.findById(id);
    }

    public ContaBancaria salvar(ContaBancaria conta) {
        return contaBancariaRepository.save(conta);
    }

    public void deletar(Long id) {
        contaBancariaRepository.deleteById(id);
    }
}

