package net.tecgurus.agenda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.agenda.mappers.ContactoMapper;
import net.tecgurus.agenda.model.Contacto;

@Component
public class ContactoDao {
	
	@Autowired
	private ContactoMapper contactoMapper;
	
	public void insertarContacto(Contacto contacto) {
		contactoMapper.insertarContacto(contacto);
	}
	
	public List<Contacto> buscar( String busqueda,Integer id){
		return contactoMapper.buscar(busqueda, id);
	}
	
}
