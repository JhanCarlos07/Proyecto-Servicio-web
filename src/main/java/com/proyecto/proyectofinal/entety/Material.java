package com.proyecto.proyectofinal.entety;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Material")
@Table(name="material")
public class Material {
	@Id
	String codigo;
	String pintura;
	String tpo_material;
	String varilla_electrodo;
	String tpo_maquina;
	public Material() {
		super();
	}
	public Material(String codigo, String pintura, String tpo_material, String varilla_electrodo, String tpo_maquina) {
		super();
		this.codigo = codigo;
		this.pintura = pintura;
		this.tpo_material = tpo_material;
		this.varilla_electrodo = varilla_electrodo;
		this.tpo_maquina = tpo_maquina;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPintura() {
		return pintura;
	}
	public void setPintura(String pintura) {
		this.pintura = pintura;
	}
	public String getTpo_material() {
		return tpo_material;
	}
	public void setTpo_material(String tpo_material) {
		this.tpo_material = tpo_material;
	}
	public String getVarilla_electrodo() {
		return varilla_electrodo;
	}
	public void setVarilla_electrodo(String varilla_electrodo) {
		this.varilla_electrodo = varilla_electrodo;
	}
	public String getTpo_maquina() {
		return tpo_maquina;
	}
	public void setTpo_maquina(String tpo_maquina) {
		this.tpo_maquina = tpo_maquina;
	}
	
	}
	
	


