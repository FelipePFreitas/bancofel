package br.com.felipefreitas.bancofel.enums;

import lombok.Getter;

@Getter
public enum ClienteTipo {
    PESSOA_FISICA("Pessoa física"),
    PESSOA_JURIDICA("Pessoa jurídica");

    private final String descricao;

    ClienteTipo(String descricao) {
        this.descricao = descricao;
    }
}
