package com.firstproject.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstproject.vendas.model.Venda;
import com.firstproject.vendas.repository.Vendas;
import com.firstproject.vendas.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {
	
	@Autowired
	private Vendas vendas;
	
	@Autowired
	private VendaService vendaService;
	
	
	@GetMapping
	public List<Venda> listar(){
		return vendas.findAll();
	}
	
	
	@PostMapping
	public Venda adicionar(@RequestBody Venda venda) {
		return vendaService.adicionar(venda);
	}

}
