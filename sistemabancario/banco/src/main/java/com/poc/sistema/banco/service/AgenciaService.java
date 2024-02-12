package com.poc.sistema.banco.service;

import com.poc.sistema.banco.interfaces.CrudInterface;
import com.poc.sistema.banco.model.Agencia;
import com.poc.sistema.banco.repository.AgenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgenciaService implements CrudInterface<Agencia> {
    @Autowired
    private AgenciaRepository agenciaRepository;

    @Override
    public void create(Agencia agencia) {
        agenciaRepository.save(agencia);
    }

    public Agencia update(Long id, Agencia agencia){
       Agencia ag = agenciaRepository.findById(id).get();
       ag.setNome(agencia.getNome());
       ag.setTelefone(agencia.getTelefone());
       ag.setEndereco(agencia.getEndereco());
       agenciaRepository.save(ag);
       return ag;
    }

    @Override
    public List<Agencia> getAll() {
        List<Agencia> agenciaList = new ArrayList<>();
        agenciaRepository.findAll().forEach(agencia -> agenciaList.add(agencia));
        return agenciaList;
    }

    @Override
    public Agencia getById(Long id) {
        Agencia targetAgencia = agenciaRepository.findById(id).get();
        return targetAgencia;
    }

    @Override
    public void deleteById(Long id) {
        agenciaRepository.deleteById(id);
    }
}
