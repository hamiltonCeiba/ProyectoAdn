package com.transporte.demo.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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

	/*@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}*/
	
	@CrossOrigin
	@RequestMapping(
			value ="/Conductor/{cedula}",
			method=RequestMethod.GET,
			produces = APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public Conductor getEmployeByName(String cedula) {
		return conductorService.findByName(cedula);
	}

}
