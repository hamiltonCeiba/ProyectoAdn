package com.transporte.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.transporte.demo.Entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>  {

	//public List<Vehiculo> findAllVehiculos();
	
	public Vehiculo findByPlacaVehi(String placa);
}
