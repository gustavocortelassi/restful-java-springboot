package com.sistema.apirest.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.apirest.Model.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
