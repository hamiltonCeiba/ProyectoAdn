package com.transporte.demo.Service;

import java.util.List;

import com.transporte.demo.Entity.Conductor;

public interface ConductorService {
	
	Conductor findByCedulaCond(String cedula);
	
	List<Conductor> findAllConductors();

}
