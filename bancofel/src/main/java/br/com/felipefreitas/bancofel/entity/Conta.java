package br.com.felipefreitas.bancofel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "contas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Número de conta não pode estar em branco")
    @Column(name = "numero_conta",unique = true)
    private String numeroConta;

    @NotBlank(message = "Número de agência não pode estar em branco")
    private String agencia;

    @NotNull(message = "O saldo é obrigatório")
    @PositiveOrZero(message = "O saldo não pode ser negativo")
    @Column(precision = 12, scale = 2)
    private BigDecimal saldo;

    @ManyToOne
    @JoinColumn(name = "fk_cliente_id",nullable = false)
    @NotNull(message = "Cliente não pode ser nulo")
    private Cliente cliente;
}
