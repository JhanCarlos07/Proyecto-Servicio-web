package com.proyecto.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyectofinal.entety.Obras;

@Repository
public interface ObrasRepository  extends JpaRepository<Obras, String>{

}
