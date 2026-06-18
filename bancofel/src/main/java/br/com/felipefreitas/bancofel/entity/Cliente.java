package br.com.felipefreitas.bancofel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 3, max = 100, message = "O nome tem que ter entre 3 e 100 caracteres")
    private String nome;

    @NotBlank(message = "O sobrenome não pode estar em branco")
    @Size(min = 3, max = 100, message = "O sobrenome tem que ter entre 3 e 100 caracteres")
    private String sobrenome;

    @NotBlank(message = "O cpf não pode estar em branco")
    @Column(unique = true)
    private String cpf;

    @NotNull(message = "O ano de nascimento não pode estar em branco")
    @Column(name = "ano_nascimento")
    private LocalDate anoNascimento;

    @NotBlank(message = "O logradouro não pode estar em branco")
    private String logradouro;

    @NotBlank(message = "O endereço não pode estar em branco")
    private String endereco;

    @NotBlank(message = "O numero não pode estar em branco")
    private String numero;

    @NotBlank(message = "O bairro não pode estar em branco")
    private String bairro;

    @NotBlank(message = "A cidade não pode estar em branco")
    private String cidade;

    @NotBlank(message = "O estado não pode estar em branco")
    private String estado;


}
