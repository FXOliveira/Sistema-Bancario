package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.Extrato;
import com.poc.sistema.banco.service.ExtratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ExtratoController {
    @Autowired
    private ExtratoService extratoService;

    @RequestMapping(value = "/extrato", method = RequestMethod.POST)
    public void createExtrato(@RequestBody Extrato extrato){
        extratoService.create(extrato);
    }
    @RequestMapping(value = "/extrato/{id}", method = RequestMethod.GET)
    public Extrato getExtratoById(@PathVariable("id") Long id){
        return extratoService.getById(id);
    }

    @RequestMapping(value = "/extrato", method = RequestMethod.GET)
    public List<Extrato> getAllExtrato(){
        return extratoService.getAll();
    }
    @RequestMapping(value = "/extrato/{id}", method = RequestMethod.DELETE)
    public void deleteExtratoById(@PathVariable("id") Long id){
        extratoService.deleteById(id);
    }
}
