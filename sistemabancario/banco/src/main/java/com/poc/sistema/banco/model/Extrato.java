package com.poc.sistema.banco.model;

import com.poc.sistema.banco.enums.TipoOperacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
