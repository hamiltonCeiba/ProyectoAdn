package com.transporte.demo.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.demo.Entity.Conductor;
import com.transporte.demo.Service.ConductorService;

@RestController
@RequestMapping("/api")
public class ConductorRestController {
	
	@Autowired
	private ConductorService conductorService;
	
	@CrossOrigin
	@RequestMapping(value ="/Conductor/{cedula}",method=RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Conductor getConductorPorCedula(String cedula) {
		return conductorService.findByCedulaCond(cedula);
	}

	@CrossOrigin
	@RequestMapping(value ="/Conductores",method=RequestMethod.GET,	produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Conductor> getAllConductores() {
		return conductorService.findAllConductors();
	}

}
