package com.transporte.demo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.transporte.demo.Entity.Conductor;
import com.transporte.demo.Repository.ConductorRepository;
import com.transporte.demo.Service.ConductorService;
import com.transporte.demo.Service.ServiceImpl.ConductorServiceImpl;

@RunWith(SpringRunner.class)
public class ConductorServiceImplIntegrationTest {
	
	@TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public ConductorService employeeService() {
            return new ConductorServiceImpl();
        }
    }
 
    @Autowired
    private ConductorService employeeService;
 
    @MockBean
    private ConductorRepository employeeRepository;
    
    
    @Before
    public void setUp() {
        Conductor alex = new Conductor("1234");
     
        Mockito.when(employeeRepository.findByCedula(alex.getCedulaCond()))
          .thenReturn(alex);
    }

}
