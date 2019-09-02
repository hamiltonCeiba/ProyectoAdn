package com.transporte.demo.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.demo.Entity.Servicio;
import com.transporte.demo.Repository.ServicioRepository;
import com.transporte.demo.Service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService {

	@Autowired
	private ServicioRepository servicioRepository;
	@Override
	public Servicio findServicioById(int idServicio) {
		return servicioRepository.findByIdServicio(idServicio);
	}

}
