package com.firstproject.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
