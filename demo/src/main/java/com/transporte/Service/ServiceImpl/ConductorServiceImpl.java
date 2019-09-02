package com.transporte.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.transporte.Service.ConductorService;
import com.transporte.demo.Entity.Conductor;
import com.transporte.demo.Repository.ConductorRepository;

public class ConductorServiceImpl implements ConductorService {

	@Autowired
	private ConductorRepository conductorRepository;
	@Override
	public Conductor findByName(String cedula) {
		return conductorRepository.findByCedula(cedula);
	}

}
