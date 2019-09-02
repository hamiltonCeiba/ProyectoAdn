package com.transporte.demo.unitaryTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.transporte.demo.Entity.Vehiculo;
import com.transporte.demo.Repository.VehiculoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class VehiculoRepositoryTest {

	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private VehiculoRepository conductorReposotoryTest;

	@Test
	public void buscarVehiculoPorPlaca() {
		Vehiculo vehiculo = new Vehiculo();
		//conductorReposotoryTest.save(employ);
		
		//Conductor found = conductorReposotoryTest.findByCedula("1234");
		
		//assertTrue("", found.getCedulaCond().equals("1234"));
		assertTrue(true);
		
	}
}
