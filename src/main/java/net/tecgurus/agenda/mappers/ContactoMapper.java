package net.tecgurus.agenda.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.tecgurus.agenda.model.Contacto;

public interface ContactoMapper {
	
	@Insert("INSERT INTO contactos(nombre, apellido, direccion, telefono, email, fechaNacimiento, id_usuario)"+
			"VALUES(#{nombre},#{apellido},#{direccion},#{telefono},#{email},#{fechaNacimiento},#{id_usuario})") 
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public void insertarContacto(Contacto contacto);
	
	public List<Contacto> buscar(@Param("busqueda") String busqueda, @Param("id")Integer id);
	
	public Long buscarCount(@Param("busqueda") String busqueda,@Param("id")Integer id);
	
	@Select("select * from contactos where id = #{idContact} and id_usuario=#{idUser}")
	public Contacto traerPorid(@Param("idUser") Integer idUser, @Param("idContact") Integer idContact);
	
	@Delete("delete from contactos where id = #{idContact} and id_usuario = #{idUser} ")
	public void eliminarPorId(@Param("idUser") Integer idUser, @Param("idContact") Integer idContact);
	
	@Update("update contactos set " + 
			"nombre = #{nombre}, " + 
			"apellido = #{apellido}, " + 
			"direccion = #{direccion}, " + 
			"telefono =  #{telefono}, " + 
			"email =  #{email}, " + 
			"fechaNacimiento = #{fechaNacimiento} " + 
			"where id = #{id};")
	public void actualizarContacto(Contacto contacto);
	
	
	@Update("UPDATE contactos set imagen = #{imagePath} WHERE id = #{idContacto} and id_usuario = #{idUser}")
	public void saveImage(@Param("imagePath") String imagePath, @Param("idContacto") Integer id, @Param("idUser") Integer idUser);
}
