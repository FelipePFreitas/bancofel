package br.com.felipefreitas.bancofel.entity;

import br.com.felipefreitas.bancofel.enums.TipoTransacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "transacoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "tipo_transacao", nullable = false)
    private TipoTransacao tipoTransacao;

    @NotNull(message = "Saldo é obrigatório")
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal valor;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "fk_conta_origem_conta", nullable = false)
    private Conta contaOrigem;

    @ManyToOne
    @JoinColumn(name = "fk_conta_destino_conta")
    private Conta contaDestino;

}
