package net.tecgurus.agenda.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.tecgurus.agenda.model.Contacto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/applicationContext.xml"})
public class ContactoServiceTest {

	@Autowired
	ContactoService contactoService;
	
	@Test
	public void buscar() {
		contactoService.buscar(null,1).forEach(System.out::println);
	}
	
	
	@Test
	public void insertarContacto(){
		Contacto contacto= new Contacto();
		
		contacto.setNombre("test");
		contacto.setApellido("apellido test");
		contacto.setDireccion("direccion test");
		contacto.setEmail("test@test.test");
		contacto.setFechaNacimiento(new Date());
		contacto.setId_usuario(1);
		contacto.setTelefono("telefono test");
		
		contactoService.insertarContacto(contacto);
	}

}
