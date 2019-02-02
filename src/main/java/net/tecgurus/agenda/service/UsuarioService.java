package net.tecgurus.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.agenda.dao.UsuarioDao;
import net.tecgurus.agenda.model.Usuario;

@Component
public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	public void insertarUsuario(Usuario usuario) {
		usuarioDao.insertarUsuario(usuario);
	}
	
	public List<Usuario> getAll(){
		return usuarioDao.getAll();
	}

}
