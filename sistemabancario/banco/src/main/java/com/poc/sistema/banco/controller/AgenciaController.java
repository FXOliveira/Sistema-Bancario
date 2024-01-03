package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.Agencia;
import com.poc.sistema.banco.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgenciaController {
    @Autowired
    private AgenciaService agenciaService;

    @RequestMapping(value = "/agencia", method = RequestMethod.POST)
    public void createAgencia(@RequestBody Agencia agencia){
        agenciaService.create(agencia);
    }

    @RequestMapping(value = "/agencia/{id}", method = RequestMethod.GET)
    public Agencia getAgenciaById(@PathVariable("id") Long id){
        return agenciaService.getById(id);
    }

    @RequestMapping(value = "/agencia", method = RequestMethod.GET)
    public List<Agencia> getAllAgencia(){
        return agenciaService.getAll();
    }
    @RequestMapping(value = "/agencia/{id}", method = RequestMethod.DELETE)
    public void deleteAgenciaById(@PathVariable("id") Long id){
        agenciaService.deleteById(id);
    }

}
