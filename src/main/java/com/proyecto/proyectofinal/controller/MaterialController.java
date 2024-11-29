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

import com.proyecto.proyectofinal.entety.Material;
import com.proyecto.proyectofinal.service.MaterialService;
@RestController
@RequestMapping("/material")
@CrossOrigin(origins = "http://localhost:4200/")
public class MaterialController {
	
	@Autowired
	MaterialService materialservice;
    @PostMapping("/registrar")
	public Material registrar(@RequestBody Material material) {
		return materialservice.registrar(material);
	}
    @PutMapping("/actualizar")
	public Material actualizar(@RequestBody Material material) {
		return materialservice.actualizar(material);
	}
    @DeleteMapping("/eliminar/{codigo}")
	public void borrar( Material material) {
		materialservice.borrar(material);
	}
    @GetMapping("/consultar")
	public List<Material> consultar() {
		return materialservice.consultar();
	}
	

}
