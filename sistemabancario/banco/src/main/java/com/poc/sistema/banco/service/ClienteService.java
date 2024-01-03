package com.poc.sistema.banco.service;

import com.poc.sistema.banco.interfaces.CrudInterface;
import com.poc.sistema.banco.model.Cliente;
import com.poc.sistema.banco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements CrudInterface<Cliente> {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void create(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Cliente update(Long id, Cliente cliente){
        Cliente cli = clienteRepository.findById(id).get();
        cli.setNome(cliente.getNome());
        cli.setTelefone(cliente.getTelefone());
        cli.setEndereco(cliente.getEndereco());
        cli.setCpf(cliente.getCpf());
        clienteRepository.save(cli);
        return cli;
    }

    @Override
    public List<Cliente> getAll() {
        List<Cliente> clienteList = new ArrayList<>();
        clienteRepository.findAll().forEach(cliente -> clienteList.add(cliente));
        return clienteList;
    }

    @Override
    public Cliente getById(Long id) {
        Cliente targetCliente = clienteRepository.findById(id).get();
        return targetCliente;
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

}
