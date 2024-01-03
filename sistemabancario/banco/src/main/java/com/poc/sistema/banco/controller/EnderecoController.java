package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.Endereco;
import com.poc.sistema.banco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping(value = "/")
    public void createEndereco(@RequestBody Endereco endereco){
        enderecoService.create(endereco);
    }

    @PutMapping(value = "/{id}")
    public Endereco updateEndereco(@PathVariable("id") Long id, @RequestBody Endereco endereco){
        return enderecoService.updateEndereco(id, endereco);
    }
    @GetMapping(value = "/{id}")
    public Endereco getEnderecoById(@PathVariable("id") Long id){
        return enderecoService.getById(id);
    }

    @GetMapping(value = "/")
    public List<Endereco> getAllEndereco(){
        return enderecoService.getAll();
    }
    @DeleteMapping(value = "/{id}")
    public void deleteEnderecoById(@PathVariable("id") Long id){
        enderecoService.deleteById(id);
    }

}
