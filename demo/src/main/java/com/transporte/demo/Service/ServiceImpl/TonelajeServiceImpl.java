package com.transporte.demo.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.demo.Entity.Tonelaje;
import com.transporte.demo.Repository.TonelajeRepository;
import com.transporte.demo.Service.TonelajeService;

@Service
public class TonelajeServiceImpl implements TonelajeService {

	@Autowired
	private TonelajeRepository tonelajeRepository;
	
	@Override
	public Tonelaje findByIdTonelaje(int idTonelaje) {
		return tonelajeRepository.findByIdTonelaje(idTonelaje);		
	}

}
