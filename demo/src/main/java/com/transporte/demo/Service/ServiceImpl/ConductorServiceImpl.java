package com.transporte.demo.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.demo.Entity.Conductor;
import com.transporte.demo.Repository.ConductorRepository;
import com.transporte.demo.Service.ConductorService;

@Service
public class ConductorServiceImpl implements ConductorService {

	@Autowired
	private ConductorRepository conductorRepository;
	@Override
	public Conductor findByCedulaCond(String cedula) {
		return conductorRepository.findByCedulaCond(cedula);
	}

}
