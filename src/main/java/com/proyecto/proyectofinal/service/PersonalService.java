package com.proyecto.proyectofinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.proyectofinal.entety.Personal;
@Service
public interface PersonalService  {
	
	public Personal registrar ( Personal personal);
	public  Personal actualizar( Personal personal);
	public void borrar ( Personal personal);
	public List< Personal> consultar();
	

}
