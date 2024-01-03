package com.poc.sistema.banco.model;

import com.poc.sistema.banco.enums.TipoOperacaoEnum;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
public class Extrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "data_hora_movimento")
    private LocalDateTime dataHoraMovimento;

    @Column(name = "tipo_operacao")
    private TipoOperacaoEnum tipoOperacao;

    @Column(name = "valor_operacao")
    private double valorOperacao;
    @ManyToOne
    private ContaCorrente contaCorrente;

    public Extrato(TipoOperacaoEnum tipoOperacao, double valorOperacao, ContaCorrente contaCorrente) {
        this.tipoOperacao = tipoOperacao;
        this.valorOperacao = valorOperacao;
        this.contaCorrente = contaCorrente;
    }

    public Extrato(TipoOperacaoEnum tipoOperacao, double valorOperacao) {
        this.tipoOperacao = tipoOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Extrato() {
    }

    public LocalDateTime getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public TipoOperacaoEnum getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
