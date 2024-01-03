package com.poc.sistema.banco.service;

import com.poc.sistema.banco.interfaces.CrudInterface;
import com.poc.sistema.banco.model.Extrato;
import com.poc.sistema.banco.repository.ExtratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExtratoService implements CrudInterface<Extrato> {
    @Autowired
    private ExtratoRepository extratoRepository;
    @Override
    public void create(Extrato extrato) {
        extratoRepository.save(extrato);
    }
    @Override
    public List<Extrato> getAll() {
        List<Extrato> extratoList = new ArrayList<>();
        extratoRepository.findAll().forEach(extrato-> extratoList.add(extrato));
        return extratoList;
    }
    @Override
    public Extrato getById(Long id) {
        Extrato targetExtrato = extratoRepository.findById(id).get();
        return targetExtrato;
    }

    @Override
    public void deleteById(Long id) {
        extratoRepository.deleteById(id);
    }
}
