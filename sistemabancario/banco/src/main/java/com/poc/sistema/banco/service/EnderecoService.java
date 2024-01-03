package com.poc.sistema.banco.service;

import com.poc.sistema.banco.interfaces.CrudInterface;
import com.poc.sistema.banco.model.Endereco;
import com.poc.sistema.banco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoService implements CrudInterface<Endereco> {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void create(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public Endereco updateEndereco(Long id, Endereco endereco){
        Endereco end = enderecoRepository.findById(id).get();
        end.setRua(endereco.getRua());
        end.setBairro(endereco.getBairro());
        end.setCep(endereco.getCep());
        enderecoRepository.save(end);
        return end;
    }

    @Override
    public List<Endereco> getAll() {
        List<Endereco> enderecoList = new ArrayList<>();
        enderecoRepository.findAll().forEach(endereco -> enderecoList.add(endereco));
        return enderecoList;
    }
    @Override
    public Endereco getById(Long id) {
        Endereco targetEndereco = enderecoRepository.findById(id).get();
        return targetEndereco;
    }
    @Override
    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
}
