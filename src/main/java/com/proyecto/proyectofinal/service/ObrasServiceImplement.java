package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Obras;
import com.proyecto.proyectofinal.repository.ObrasRepository;
@Service
public class ObrasServiceImplement implements ObrasService{
	
	@Autowired
	ObrasRepository obrasRepository;

	@Override
	public Obras registrar(Obras obras) {
		// TODO Auto-generated method stub
		return obrasRepository.save(obras);
	}

	@Override
	public Obras actualizar(Obras obras) {
		// TODO Auto-generated method stub
		return obrasRepository.save(obras);
	}

	@Override
	public void borrar(Obras obras) {
		// TODO Auto-generated method stub
		obrasRepository.delete(obras);
	}

	@Override
	public List<Obras> consultar() {
		// TODO Auto-generated method stub
		return obrasRepository.findAll();
	}

}
