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

import com.transporte.demo.Entity.Vehiculo;
import com.transporte.demo.Service.VehiculoService;

@RestController
@RequestMapping("/api")
public class VehiculoRestController {
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@CrossOrigin
	@RequestMapping(value ="/vehiculo/{placa}",method=RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Vehiculo getVehiculoByPlaca(String placa) {
		return vehiculoService.findByPlacaVehi(placa);
	}
	
	@CrossOrigin
	@RequestMapping(value ="/vehiculos",method=RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Vehiculo> getListVehiculos() {
		return vehiculoService.findAllVehiculos();
	}

}
