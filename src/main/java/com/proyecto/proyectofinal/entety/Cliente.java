package com.proyecto.proyectofinal.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Cliente")
@Table(name="cliente")
public class Cliente {
	@Id
	String direccion;
	String ruc;
	String razon_social;
	String cel;
	public Cliente() {
		super();
	}
	public Cliente(String direccion, String ruc, String razon_social, String cel) {
		super();
		this.direccion = direccion;
		this.ruc = ruc;
		this.razon_social = razon_social;
		this.cel = cel;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	
	
}
