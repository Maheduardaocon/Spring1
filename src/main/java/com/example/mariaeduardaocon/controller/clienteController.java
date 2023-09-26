package com.example.mariaeduardaocon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mariaeduardaocon.entities.cliente;
import com.example.mariaeduardaocon.services.clienteServices;

@RestController
@RequestMapping("/client")
public class clienteController {

	
	private final clienteServices clienteServices;

	@Autowired
	public clienteController(clienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}

	@PostMapping
	public cliente creatcliente(@RequestBody cliente cliente) {
		return clienteServices.saveCliente(cliente);
	}

	@GetMapping("/(idcCliente)")
	public cliente getCliente(@PathVariable Long idcCliente) {
		return clienteServices.getClienteById(idcCliente);
	}

	@GetMapping
	public List<cliente> getAllCliente() {
		return clienteServices.getAllCliente();
	}

	@DeleteMapping("/(id)")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteServices.deletecliente(idcCliente);
	}

}
