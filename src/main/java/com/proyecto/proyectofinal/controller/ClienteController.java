package com.proyecto.proyectofinal.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyectofinal.entety.Cliente;
import com.proyecto.proyectofinal.service.ClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
    @PostMapping("/registrar")
    Cliente registrar(@RequestBody Cliente cliente) {
		return clienteService.registrar(cliente);
	}
    @PutMapping("/actualizar")
	public Cliente actualizar(@RequestBody Cliente cliente) {
		return clienteService.actualizar(cliente);
	}
    @DeleteMapping("/eliminar/{direccion}")
	public void borrar(Cliente cliente) {
		clienteService.borrar(cliente);
		
	}
    @GetMapping("/consultar")
	public List<Cliente> consultar() {
		return clienteService.consultar();
	}
	

}
