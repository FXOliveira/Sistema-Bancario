package com.poc.sistema.banco.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
    @Column(name = "numero_conta")
    private long numero;
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    private double saldo;

}
