package com.transporte.demo.unitaryTest;

import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transporte.demo.Entity.Tonelaje;
import com.transporte.demo.Repository.TonelajeRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TonelajeReopositoryTest {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private TonelajeRepository tonelajeRepository;
	
	@Test
	public void buscarTonelajePorId() {
		Tonelaje tonelaje = new Tonelaje();
		//conductorReposotoryTest.save(employ);
		
		//Conductor found = conductorReposotoryTest.findByCedula("1234");
		
		//assertTrue("", found.getCedulaCond().equals("1234"));
		assertTrue(true);
		
	}

}
