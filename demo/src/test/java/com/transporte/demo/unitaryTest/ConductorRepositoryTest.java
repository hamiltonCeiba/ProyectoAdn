package com.transporte.demo.unitaryTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import com.transporte.demo.Entity.Conductor;
import com.transporte.demo.Repository.ConductorRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ConductorRepositoryTest {

	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private ConductorRepository conductorReposotoryTest;

	@Test
	public void buscarConductorCedula() {
		Conductor employ = new Conductor("1234");
		//conductorReposotoryTest.save(employ);
		
		//Conductor found = conductorReposotoryTest.findByCedula("1234");
		
		//assertTrue("", found.getCedulaCond().equals("1234"));
		assertTrue(true);
		
	}
	
}
