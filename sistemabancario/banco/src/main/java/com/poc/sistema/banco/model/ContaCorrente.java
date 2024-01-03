package com.poc.sistema.banco.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ContaCorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;

    @Column(name = "telefone")
    private String telefone;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "numero_conta")
    private long numero;
    private double saldo;
    @OneToMany(mappedBy = "contaCorrente")
    private List<Extrato> extrato;

    public ContaCorrente(Agencia agencia, String telefone, Cliente cliente, long numero) {
        this.agencia = agencia;
        this.telefone = telefone;
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0;
    }

    public ContaCorrente(Agencia agencia, String telefone, Cliente cliente) {
        this.agencia = agencia;
        this.telefone = telefone;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public ContaCorrente(Agencia agencia, String telefone) {
        this.agencia = agencia;
        this.telefone = telefone;
        this.saldo = 0;
    }

    public ContaCorrente() {
        this.saldo = 0;
    }

    public Long getId() {
        return id;
    }
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
