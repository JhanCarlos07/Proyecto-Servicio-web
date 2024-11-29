package com.proyecto.proyectofinal.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Obras")
@Table(name="obras")
public class Obras {
	@Id
	String tpo;
	String costo;
	public Obras() {
		super();
	}
	public Obras(String tpo, String costo) {
		super();
		this.tpo = tpo;
		this.costo = costo;
	}
	public String getTpo() {
		return tpo;
	}
	public void setTpo(String tpo) {
		this.tpo = tpo;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	
	

}
