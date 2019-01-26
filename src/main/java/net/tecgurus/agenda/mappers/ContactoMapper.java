package net.tecgurus.agenda.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import net.tecgurus.agenda.model.Contacto;

public interface ContactoMapper {
	
	@Insert("INSERT INTO contactos(nombre, apellido, direccion, telefono, email, fechaNacimiento, id_usuario)"+
			"VALUES(#{nombre},#{apellido},#{direccion},#{telefono},#{email},#{fechaNacimiento},#{id_usuario})") 
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void insertarContacto(Contacto contacto);
	
	public List<Contacto> buscar(@Param("busqueda") String busqueda, @Param("id")Integer id);
	
	public Long buscarCount(@Param("busqueda") String busqueda,Integer id);
	
	public Contacto traerPorid(Integer idUsuario,Integer idContacto);
	
	public void eliminarPorId(Integer idUsuario,Integer idContacto);
	
	public void actualizarContacto(Contacto contacto);
}
