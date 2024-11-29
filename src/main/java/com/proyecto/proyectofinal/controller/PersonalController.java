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

import com.proyecto.proyectofinal.entety.Personal;
import com.proyecto.proyectofinal.service.PersonalService;


@RestController
@RequestMapping("/personal")
@CrossOrigin(origins ="http://localhost:4200/")
public class PersonalController {
	@Autowired
	PersonalService personalservice;
	
    @PostMapping("/registrar")
	public Personal registrar(@RequestBody Personal personal) {
		return personalservice.registrar(personal);
	}
    
    @PutMapping("/actualizar")
	public Personal actualizar(@RequestBody Personal personal) {
		return personalservice.actualizar(personal);
	}
    @DeleteMapping("/eliminar/{dni}")
	public void borrar( Personal personal) {
		personalservice.borrar(personal);
	}
    @GetMapping("/consultar")
	public List<Personal> consultar() {
		return personalservice.consultar();
	}
	

}
