package net.tecgurus.agenda.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.tecgurus.agenda.model.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/applicationContext.xml"})

public class UsuarioServiceTest {
	
	@Autowired
	UsuarioService usuarioService;

	@Test
	public void mostrarUsuario() {
		usuarioService.getAll().forEach(System.out::println);
	}

}
