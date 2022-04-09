package com.kruger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kruger.service.IEmpleadoService;

@SpringBootTest
class InvacappBackendApplicationTests {
	
	
	@Autowired(required = false)
	private IEmpleadoService empleadoService;
	@Test
	void contextLoads() {
		try {
			empleadoService.listar().forEach(e->System.out.println(e));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}