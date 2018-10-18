package com.firstproject.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
