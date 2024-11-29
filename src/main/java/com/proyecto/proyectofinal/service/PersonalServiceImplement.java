package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Personal;
import com.proyecto.proyectofinal.repository.PersonalRepository;
@Service
public class PersonalServiceImplement implements PersonalService {
	
	@Autowired
	PersonalRepository perosnalRepository;

	@Override
	public Personal registrar(Personal personal) {
		// TODO Auto-generated method stub
		return  perosnalRepository.save(personal);
	}

	@Override
	public Personal actualizar(Personal personal) {
		// TODO Auto-generated method stub
		return  perosnalRepository.save(personal);
	}

	@Override
	public void borrar(Personal personal) {
		// TODO Auto-generated method stub
		 perosnalRepository.delete(personal);
	}

	@Override
	public List<Personal> consultar() {
		// TODO Auto-generated method stub
		return  perosnalRepository.findAll();
	}

}
