package com.poc.sistema.banco.controller;

import com.poc.sistema.banco.model.ContaCorrente;
import com.poc.sistema.banco.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContaCorrenteController {
    @Autowired
    private ContaCorrenteService contaCorrenteService;

    @RequestMapping(value = "/contacorrente", method = RequestMethod.POST)
    public void createContaCorrente(@RequestBody ContaCorrente contaCorrente){
        contaCorrenteService.create(contaCorrente);
    }
    @RequestMapping(value = "/contacorrente/{id}", method = RequestMethod.GET)
    public ContaCorrente getContaCorrenteById(@PathVariable("id") Long id){
        return contaCorrenteService.getById(id);
    }

    @RequestMapping(value = "/contacorrente", method = RequestMethod.GET)
    public List<ContaCorrente> getAllContaCorrente(){
        return contaCorrenteService.getAll();
    }
    @RequestMapping(value = "/contacorrente/{id}", method = RequestMethod.DELETE)
    public void deleteContaCorrenteById(@PathVariable("id") Long id){
        contaCorrenteService.deleteById(id);
    }

}
