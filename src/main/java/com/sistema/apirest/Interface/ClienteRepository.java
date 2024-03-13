package com.sistema.apirest.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.apirest.Model.Cliente;

@Repository // Mark this as a Spring Data repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

