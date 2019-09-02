package com.transporte.demo.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.demo.Entity.Servicio;
import com.transporte.demo.Service.ServicioService;

@RestController
@RequestMapping("/api")
public class ServicioRestController {

	@Autowired
	private ServicioService servicioService;
	
	@CrossOrigin
	@RequestMapping(value ="/servicio/{idServicio}",method=RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Servicio obtenerServicioPorId(int idServicio) {
		return servicioService.findServicioById(idServicio);
	}
}
