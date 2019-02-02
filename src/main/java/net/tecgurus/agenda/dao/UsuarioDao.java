package net.tecgurus.agenda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.agenda.mappers.UsuarioMapper;
import net.tecgurus.agenda.model.Usuario;

@Component
public class UsuarioDao {
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	public void insertarUsuario(Usuario usuario) {
		usuarioMapper.insertarUsuario(usuario);
	}
	
	public List<Usuario> getAll(){
		return usuarioMapper.getAll();
	}
}
