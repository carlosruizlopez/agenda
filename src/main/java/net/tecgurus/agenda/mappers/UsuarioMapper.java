package net.tecgurus.agenda.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.tecgurus.agenda.model.Usuario;

public interface UsuarioMapper {

	@Insert("INSERT INTO usuarios(nombre,apellido, direccion, telefono, email, fechaNacimiento, pass)"+
			"VALUES(#{nombre},#{apellido},#{direccion},#{telefono},#{email},#{fechaNacimiento},#{pass})") 
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void insertarUsuario(Usuario usuario);
	
	@Select("SELECT * FROM usuarios")
	public List<Usuario> getAll();
	
	public void actualizarUsuario(Usuario usuario);
}
