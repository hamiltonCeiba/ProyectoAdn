package com.transporte.demo.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.demo.Entity.Tonelaje;
import com.transporte.demo.Service.TonelajeService;

@RestController
@RequestMapping("/api")
public class TonelajeRestController {

	@Autowired
	private TonelajeService tonelajeService;
	
	
	@CrossOrigin
	@RequestMapping(value ="/tonelaje/{idTonelaje}",method=RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Tonelaje obtenerTonelajePorId(int idTonelaje) {
		return tonelajeService.findByIdTonelaje(idTonelaje);
	}
	
}
