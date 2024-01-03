package com.poc.sistema.banco.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @Column(name = "telefone")
    private String telefone;
    @OneToMany
    private List<Cliente> clientes;

    public Agencia(String nome, Endereco endereco, String telefone,List<Cliente> clientes) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.clientes = clientes;
    }

    public Agencia(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Agencia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}
