package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Cliente;

@Service
public interface ClienteService {
	
	public Cliente registrar (Cliente cliente);
	public  Cliente actualizar(Cliente cliente);
	public void borrar (Cliente cliente);
	public List<Cliente> consultar();

}
