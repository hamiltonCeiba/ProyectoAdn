package com.transporte.demo.Service;

import java.util.List;

import com.transporte.demo.Entity.Vehiculo;

public interface VehiculoService {

	Vehiculo findByPlacaVehi(String placa);
	
	List<Vehiculo> findAllVehiculos();
	
}
