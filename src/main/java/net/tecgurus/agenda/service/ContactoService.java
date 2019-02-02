package net.tecgurus.agenda.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.tecgurus.agenda.dao.ContactoDao;
import net.tecgurus.agenda.model.Contacto;

@Component
public class ContactoService {
	
	@Autowired
	private ContactoDao contactoDao;
	
	public void insertarContacto(Contacto contacto) {
		contactoDao.insertarContacto(contacto);
	}
	
	public Map<String,Object> buscar(String busqueda, Integer id, Integer pagina, Integer limite){
		//long elementos = contactoDao.buscarCount(busqueda, id);
		double totalPaginas = 1;//(double)elementos/(double)limite;
		
		if( totalPaginas%1 !=0) {
			totalPaginas++;
		}
		
		//Math.ceil(totalPaginas);
		
		Map<String, Object> respuesta=new HashMap<>();
		respuesta.put("Paginas", (int)totalPaginas);
		
		int offset = (pagina-1)*limite;
		
		respuesta.put("contactos", contactoDao.buscar(id, busqueda, offset, limite));
		return respuesta;
	}
}
