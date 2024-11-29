package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Material;

@Service
public interface MaterialService {
	
	public Material registrar (Material material);
	public  Material actualizar(Material material);
	public void borrar (Material material);
	public List<Material> consultar();


}
