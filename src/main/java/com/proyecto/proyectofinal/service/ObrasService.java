package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Obras;
@Service
public interface ObrasService  {
	
	public Obras registrar ( Obras obras);
	public   Obras actualizar( Obras obras);
	public void borrar ( Obras obras);
	public List< Obras> consultar();


}
