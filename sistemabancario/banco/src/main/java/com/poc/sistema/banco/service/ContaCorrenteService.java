package com.poc.sistema.banco.service;

import com.poc.sistema.banco.interfaces.CrudInterface;
import com.poc.sistema.banco.model.Agencia;
import com.poc.sistema.banco.model.ContaCorrente;
import com.poc.sistema.banco.repository.AgenciaRepository;
import com.poc.sistema.banco.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContaCorrenteService implements CrudInterface<ContaCorrente> {

    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;
    @Override
    public void create(ContaCorrente contaCorrente) {
        contaCorrenteRepository.save(contaCorrente);
    }
    @Override
    public List<ContaCorrente> getAll() {
        List<ContaCorrente> contaCorrentesList = new ArrayList<>();
        contaCorrenteRepository.findAll().forEach(corrente -> contaCorrentesList.add(corrente));
        return contaCorrentesList;
    }

    @Override
    public ContaCorrente getById(Long id) {
        ContaCorrente targetContaCorrente = contaCorrenteRepository.findById(id).get();
        return targetContaCorrente;
    }

    @Override
    public void deleteById(Long id) {
        contaCorrenteRepository.deleteById(id);
    }

}
