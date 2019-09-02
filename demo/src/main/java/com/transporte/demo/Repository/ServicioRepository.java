package com.transporte.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.demo.Entity.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

	public Servicio findByIdServicio(int idServicio); 
	
}
