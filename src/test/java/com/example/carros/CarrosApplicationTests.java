package com.example.carros;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;
import com.example.carros.domain.dto.CarroDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarrosApplicationTests {


	@Test
	public void contextLoads() {

	}

//	@Autowired
//	private CarroService service;
//
//	@Test
//	public void test1() {
//		Carro carro = new Carro();
//
//		carro.setNome("Ferrari");
//		carro.setTipo("Esportivos");
//
//		CarroDTO c = service.insert(carro);
//
//		assertNotNull(c);
//
//		Long id = c.getId();
//		assertNotNull(id);
//
//		Optional<CarroDTO> op = service.getCarroById(id);
//
//		assertTrue(op.isPresent());
//
//		c = op.get();
//
//		assertEquals("Ferrari", c.getNome());
//		assertEquals("Esportivos", c.getTipo());
//
//		service.delete(id);
//
//		assertFalse(service.getCarroById(id).isPresent());
//	}
	
	@Test
	public void test2() {

	}
}
