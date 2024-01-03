package com.poc.sistema.banco.enums;

public enum TipoOperacaoEnum {
    SAQUE(1),
    DEPOSITO(2),
    TRANSFERENCIA(3);

    private TipoOperacaoEnum(int operacao){
        this.operacao = operacao;
    }
    private int operacao;

    public int getOperacao() {
        return operacao;
    }
}
