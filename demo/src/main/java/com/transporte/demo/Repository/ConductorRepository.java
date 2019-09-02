package com.transporte.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transporte.demo.Entity.Conductor;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long> {
	
	public Conductor findByCedulaCond(String cedula);

}
