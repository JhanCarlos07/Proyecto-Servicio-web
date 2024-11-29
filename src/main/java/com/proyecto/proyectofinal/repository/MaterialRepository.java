package com.proyecto.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyectofinal.entety.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, String>{

}
