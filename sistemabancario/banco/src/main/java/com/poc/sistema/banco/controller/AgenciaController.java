package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.Agencia;
import com.poc.sistema.banco.model.Cliente;
import com.poc.sistema.banco.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {
    @Autowired
    private AgenciaService agenciaService;

    @PostMapping(value = "/")
    public void createAgencia(@RequestBody Agencia agencia){
        agenciaService.create(agencia);
    }
    @PutMapping(value = "/{id}")
    public Agencia updateAgencia(@PathVariable("id") Long id, @RequestBody Agencia agencia){
        return agenciaService.update(id, agencia);
    }
    @GetMapping(value = "/{id}")
    public Agencia getAgenciaById(@PathVariable("id") Long id){
        return agenciaService.getById(id);
    }

    @GetMapping(value = "/all")
    public List<Agencia> getAllAgencia(){
        return agenciaService.getAll();
    }
    @DeleteMapping(value = "/{id}")
    public void deleteAgenciaById(@PathVariable("id") Long id){
        agenciaService.deleteById(id);
    }

}
