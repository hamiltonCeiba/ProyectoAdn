package com.transporte.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.transporte.demo.Entity.Conductor;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {
	
	public Conductor findByCedula(String cedula);

}
