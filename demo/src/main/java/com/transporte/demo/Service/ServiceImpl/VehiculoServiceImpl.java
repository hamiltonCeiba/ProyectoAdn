package com.transporte.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.demo.Entity.Vehiculo;
import com.transporte.demo.Repository.VehiculoRepository;
import com.transporte.demo.Service.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public Vehiculo findByPlacaVehi(String placa) {		
		return vehiculoRepository.findByPlacaVehi(placa);
	}

	@Override
	public List<Vehiculo> findAllVehiculos() {
		//return vehiculoRepository.findAllVehiculos();
		return null;
	}

}
