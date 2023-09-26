package com.example.mariaeduardaocon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mariaeduardaocon.entities.cliente;
import com.example.mariaeduardaocon.repositories.clienteRepository;

@Service
public class clienteServices {
	private final clienteRepository clienteRepository;

	@Autowired
	public clienteServices(clienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;

	}

	public cliente saveCliente(cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}

	public List<cliente> getAllCliente() {
		return clienteRepository.findAll();
	}

	public void deletecliente(long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}

}
