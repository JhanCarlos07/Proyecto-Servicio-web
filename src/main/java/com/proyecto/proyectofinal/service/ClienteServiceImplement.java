package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Cliente;
import com.proyecto.proyectofinal.repository.ClienteRepository;
@Service
public class ClienteServiceImplement implements ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Cliente registrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente clienteExistente = clienteRepository.findById(cliente.getDireccion()).orElse(null);
	    if (clienteExistente != null) {
	        clienteExistente.setRuc(cliente.getRuc());
	        clienteExistente.setRazon_social(cliente.getRazon_social());
	        clienteExistente.setCel(cliente.getCel());
	       
	        return clienteRepository.save(clienteExistente);
	    } else {
	     
	        return null;
	    }
		
	}

	@Override
	public void borrar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepository.delete(cliente);
	}

	@Override
	public List<Cliente> consultar() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
