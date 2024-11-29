package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Material;
import com.proyecto.proyectofinal.repository.MaterialRepository;
@Service
public class MaterialServiceImplement implements MaterialService {
	@Autowired
	MaterialRepository materialRepository;

	@Override
	public Material registrar(Material material) {
		// TODO Auto-generated method stub
		return materialRepository.save(material);
	}

	@Override
	public Material actualizar(Material material) {
		// TODO Auto-generated method stub
		return materialRepository.save(material);
	}

	@Override
	public void borrar(Material material) {
		// TODO Auto-generated method stub
		materialRepository.delete(material);
	}

	@Override
	public List<Material> consultar() {
		// TODO Auto-generated method stub
		return materialRepository.findAll();
	}
	

}
