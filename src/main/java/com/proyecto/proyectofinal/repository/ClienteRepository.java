package com.proyecto.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.proyecto.proyectofinal.entety.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
