package br.com.felipefreitas.bancofel.repository;

import br.com.felipefreitas.bancofel.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
