package com.transporte.Service;

import com.transporte.demo.Entity.Conductor;

public interface ConductorService {
	
	Conductor findByName(String cedula);

}
