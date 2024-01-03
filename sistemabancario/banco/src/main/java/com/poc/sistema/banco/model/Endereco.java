package com.poc.sistema.banco.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep")
    private String cep;

    public Endereco(String rua, String bairro, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
