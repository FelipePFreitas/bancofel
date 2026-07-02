package br.com.felipefreitas.bancofel.entity;

import br.com.felipefreitas.bancofel.enums.ClienteTipo;
import br.com.felipefreitas.bancofel.enums.TipoTransacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "cliente_pf")
@PrimaryKeyJoinColumn(name = "cliente_id_pf") // Une a chave primária com a tabela mãe
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class ClientePF extends Cliente {

    @Column(unique = true, nullable = false, length = 20)
    private String cpf;

    @Column(nullable = false)
    private LocalDate dataNascimento;

}
