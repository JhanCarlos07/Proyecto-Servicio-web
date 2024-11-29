package com.proyecto.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.proyectofinal.entety.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal,String > {

}
