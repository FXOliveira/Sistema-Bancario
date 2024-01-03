package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.Cliente;
import com.poc.sistema.banco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "/")
    public void createCliente(@RequestBody Cliente cliente){
        clienteService.create(cliente);
    }

    @PutMapping(value = "/{id}")
    public Cliente updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        return clienteService.update(id, cliente);
    }
    @GetMapping(value = "/{id}")
    public Cliente getClienteById(@PathVariable("id") Long id){
        return clienteService.getById(id);
    }

    @GetMapping(value = "/")
    public List<Cliente> getAllCliente(){
        return clienteService.getAll();
    }
    @DeleteMapping(value = "/{id}")
    public void deleteClienteById(@PathVariable("id") Long id){
        clienteService.deleteById(id);
    }
}
