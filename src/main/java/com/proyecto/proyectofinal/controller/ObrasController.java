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

import com.proyecto.proyectofinal.entety.Obras;
import com.proyecto.proyectofinal.service.ObrasService;
@RestController
@RequestMapping("/obras")
@CrossOrigin(origins = "http://localhost:4200/")
public class ObrasController {
	@Autowired
	ObrasService obrasservice;
    @PostMapping("/registrar")
	public Obras registrar(@RequestBody Obras obras) {
		return obrasservice.registrar(obras);
	}
    @PutMapping("/actualizar")
	public Obras actualizar(@RequestBody Obras obras) {
		return obrasservice.actualizar(obras);
	}
    @DeleteMapping("/eliminar/{tpo}")
	public void borrar( Obras obras) {
		obrasservice.borrar(obras);
	}
    @GetMapping("/consultar")
	public List<Obras> consultar() {
		return obrasservice.consultar();
	}
	

}
